package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.caculator.databinding.ActivityMainBinding;
import com.example.caculator.utill.CharFactory;
import com.example.caculator.utill.Num;
import com.example.caculator.utill.Oper;
import com.example.caculator.utill.Rule;

import java.util.Queue;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;
    //監測是否擁有過小數點
    private boolean hasDot = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.bind(LayoutInflater.from(this).inflate(R.layout.activity_main,null));
        setContentView(binding.getRoot());


        binding.btn0.setOnClickListener(this);
        binding.btn1.setOnClickListener(this);
        binding.btn2.setOnClickListener(this);
        binding.btn3.setOnClickListener(this);
        binding.btn4.setOnClickListener(this);
        binding.btn5.setOnClickListener(this);
        binding.btn6.setOnClickListener(this);
        binding.btn7.setOnClickListener(this);
        binding.btn8.setOnClickListener(this);
        binding.btn9.setOnClickListener(this);
        binding.divide.setOnClickListener(this);
        binding.multiply.setOnClickListener(this);
        binding.minus.setOnClickListener(this);
        binding.point.setOnClickListener(this);
        binding.clear.setOnClickListener(this);
        binding.add.setOnClickListener(this);
        binding.del.setOnClickListener(this);
        binding.btnResult.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        StringBuilder input = new StringBuilder(binding.edit.getText().toString());
        switch (v.getId()){
            case R.id.btn0:
            case R.id.btn1:
            case R.id.btn2:
            case R.id.btn3:
            case R.id.btn4:
            case R.id.btn5:
            case R.id.btn6:
            case R.id.btn7:
            case R.id.btn8:
            case R.id.btn9:
                input.append(((Button)v).getText());
                binding.edit.setText(input.toString());
                break;
            case R.id.divide:
            case R.id.multiply:
            case R.id.minus:
            case R.id.add:
                if (input.length()!=0  &&
                        !input.substring(input.length()-1).equals(".") &&
                        !input.substring(input.length()-1).equals("+") &&
                        !input.substring(input.length()-1).equals("-") &&
                        !input.substring(input.length()-1).equals("*") &&
                        !input.substring(input.length()-1).equals("/")
                ){
                    input.append(((Button)v).getText());
                    binding.edit.setText(input.toString());
                    hasDot = false;
                }
                break;
            case R.id.point:
                if (!hasDot && input.length()!=0 &&
                        !input.substring(input.length()-1).equals(".") &&
                        !input.substring(input.length()-1).equals("+") &&
                        !input.substring(input.length()-1).equals("-") &&
                        !input.substring(input.length()-1).equals("*") &&
                        !input.substring(input.length()-1).equals("/") &&
                        !input.substring(input.length()-1).equals(" ")) {
                    input.append(".");
                    binding.edit.setText(input.toString());
                    hasDot = true;
                }
                break;
            case R.id.clear:
                binding.edit.setText("");
                hasDot = false;
                break;
            case R.id.del:
                if (input.length() > 0 && input.substring(input.length()-1).equals(".")) {
                    hasDot = false;
                }
                if (input.length() > 0 ) {
                binding.edit.setText(input.substring(0,input.length()-1));}
                break;
            case R.id.btn_result:
                getResult();
                break;
        }
    }

    private void getResult() {
        CharFactory charFactory= new  CharFactory();
        String input = binding.edit.getText().toString();
        //忘記正則了
        String[] strings = input.split("(?<=[*/+-])|(?=[*/+-])");
        for (String s : strings){
            charFactory.saveChar(s);
        }
        charFactory.endQueue();
        Queue<Rule> queue = charFactory.getQueue();

        //忘記stack的用法
        Stack<Double> numStack = new Stack<>();
        Stack<Oper> operStack = new Stack<>();

        while (!queue.isEmpty()) {
            Rule rule = queue.poll();
            if (rule instanceof Num) {
                numStack.push(((Num) rule).getDoubble());
            } else if (rule instanceof Oper) {
                Oper oper = (Oper) rule;
                while (!operStack.empty() && operStack.peek().getPriority() >= oper.getPriority()) {
                    double num2 = numStack.pop();
                    double num1 = numStack.pop();
                    numStack.push(operStack.pop().count(num1, num2));
                }
                operStack.push(oper);
            }
        }

        while (!operStack.empty()) {
            double num2 = numStack.pop();
            double num1 = numStack.pop();
            numStack.push(operStack.pop().count(num1, num2));
        }

        double result = numStack.pop();
        binding.edit.setText(Double.toString(result));
    }

    }
