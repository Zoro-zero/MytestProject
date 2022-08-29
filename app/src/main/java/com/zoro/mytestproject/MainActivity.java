package com.zoro.mytestproject;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private  Integer oneNumber,twoNumber;
    public Boolean isOperationClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }
    public void OnumberClick(View view) {
        switch (view.getId()){
            case R.id.OneNumber:
                if(textView.getText().toString().equals(0)){
                    textView.setText("1");
                }else if (isOperationClick){
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                break;
            case R.id.twonumber:
                if(textView.getText().toString().equals(0)){
                    textView.setText("2");
                }else if (isOperationClick){
                    textView.setText("2");
                }else {
                    textView.append("2");
                }
                break;
            case R.id.three:
                break;
            case R.id.four:
                break;
            case R.id.five:
                break;
            case R.id.six:
                break;
            case R.id.seven:
                break;
            case R.id.eigth:
                break;
            case R.id.nine:
                break;
        }
        isOperationClick=false;
    }
    public void OperationeClick(View view) {
        switch (view.getId()){
            case R.id.plus:
                oneNumber=Integer.parseInt(textView.getText().toString());
                break;
            case R.id.minus:
                break;
            case R.id.rovno:
                twoNumber=Integer.parseInt(textView.getText().toString());
                Integer resultplus=oneNumber+twoNumber;
                textView.setText(resultplus.toString());
                break;
        }
        isOperationClick=true;
    }
}