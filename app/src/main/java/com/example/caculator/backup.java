package com.example.caculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.caculator.databinding.ActivityMainBinding;

public class backup {




}

//package com.example.caculator;
//
//        import androidx.appcompat.app.AppCompatActivity;
//
//        import android.os.Bundle;
//        import android.view.LayoutInflater;
//        import android.view.View;
//        import android.widget.Button;
//
//        import com.example.caculator.databinding.ActivityMainBinding;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//    ActivityMainBinding binding;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        binding = ActivityMainBinding.bind(LayoutInflater.from(this).inflate(R.layout.activity_main,null));
//        setContentView(binding.getRoot());
//
//        binding.btn0.setOnClickListener(this);
//        binding.btn1.setOnClickListener(this);
//        binding.btn2.setOnClickListener(this);
//        binding.btn3.setOnClickListener(this);
//        binding.btn4.setOnClickListener(this);
//        binding.btn5.setOnClickListener(this);
//        binding.btn6.setOnClickListener(this);
//        binding.btn7.setOnClickListener(this);
//        binding.btn8.setOnClickListener(this);
//        binding.btn9.setOnClickListener(this);
//        binding.divide.setOnClickListener(this);
//        binding.multiply.setOnClickListener(this);
//        binding.minus.setOnClickListener(this);
//        binding.point.setOnClickListener(this);
//        binding.clear.setOnClickListener(this);
//        binding.add.setOnClickListener(this);
//        binding.del.setOnClickListener(this);
//        binding.btnResult.setOnClickListener(this);
//
//
//
//
//    }
//
//    @Override
//    public void onClick(View v) {
//        StringBuilder input = new StringBuilder(binding.edit.getText().toString());
//        switch (v.getId()){
//            case R.id.btn0:
//            case R.id.btn1:
//            case R.id.btn2:
//            case R.id.btn3:
//            case R.id.btn4:
//            case R.id.btn5:
//            case R.id.btn6:
//            case R.id.btn7:
//            case R.id.btn8:
//            case R.id.btn9:
//                input.append(((Button)v).getText());
//                binding.edit.setText(input.toString());
//                break;
//            case R.id.divide:
//            case R.id.multiply:
//            case R.id.minus:
//            case R.id.add:
//                input.append(" "+((Button)v).getText()+" ");
//                binding.edit.setText(input.toString());
//                break;
//            case R.id.point:
//                if (input.substring(input.length()-1)!="." &&
//                        input.substring(input.length()-1)!=" " && input.length()!=0)
//                {
//                    input = input.append(("."));
//                    binding.edit.setText(input.toString());
//                }
//                break;
//            case R.id.clear:
//                binding.edit.setText("");
//                break;
//            case R.id.del:
//
//                binding.edit.setText(input.substring(0,input.length()-1));
//                break;
//            case R.id.btn_result:
//                getResult();
//                break;
//            default:
//
//
//
//        }
//    }
//
//    private void getResult() {
//        String input = binding.edit.getText().toString();
//        if(input.length()!=0 && input!=null){
//
//        }
//
//    }
//}
