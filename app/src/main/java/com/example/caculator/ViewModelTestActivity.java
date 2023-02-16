package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewModelTestActivity extends AppCompatActivity {
    MyViModel myViModel;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewmodel_test);

        myViModel = new ViewModelProvider(this).get(MyViModel.class);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        Log.d("vvvvv", "onCreate: "+myViModel);


        myViModel.getLiveCount().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                //當Live引參改變,傳回引參的getValue值做回調事件
                textView.setText(integer.toString());
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViModel.addCountNum();
            }
        });




    }
}