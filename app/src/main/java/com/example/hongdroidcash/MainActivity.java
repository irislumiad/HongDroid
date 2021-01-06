package com.example.hongdroidcash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_title; // 텍스트뷰 변수 선언
    Button btn_buy; // 버튼 변수 선언
    EditText et_name; // 에딧 텍스트 변수 선언
    ImageView iv_profile; // 이미지뷰 변수 선언


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 액티비티 메인과 연결

        tv_title = findViewById(R.id.tv_title); // 뷰를 id를 통해서 연결
        btn_buy = findViewById(R.id.btn_buy); // id를 통해서 연결
        et_name = findViewById(R.id.et_name); // 뷰 아이디 통해서 연결
        iv_profile = findViewById(R.id.iv_profile);

        tv_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_title.setText("홍드로이드 잘생겼어요.");


            }
        });
        btn_buy.setOnClickListener(new View.OnClickListener() { // 해당 뷰 클릭 시 수행
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , HistoryActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,  et_name.getText().toString() + "가 구매되었습니다.", Toast.LENGTH_SHORT).show(); // 토스트 메시지 띄운다.
            }
        });

        iv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "이전되었습니다.", Toast.LENGTH_SHORT).show();

            }
        });




    }
}