package kr.co.woobi.imyeon.mylinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view){
        switch(view.getId()){
            case R.id.button1:
                Toast.makeText(getApplicationContext(), "버튼1이 눌렸습니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "버튼2가 눌렸습니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "버튼3이 눌렸습니다.",Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
