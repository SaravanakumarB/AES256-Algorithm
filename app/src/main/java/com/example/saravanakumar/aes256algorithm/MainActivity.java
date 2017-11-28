package com.example.saravanakumar.aes256algorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String value = "MyPassword";
        String key = "asdfghjkl";
        TextView tvEncrypt, tvDecrypt;
        tvEncrypt = findViewById(R.id.tv_encrypt);
        tvDecrypt = findViewById(R.id.tv_decrypt);
        String encrypt = AESAlgorithm.encryptData(value,key);
        tvEncrypt.setText(encrypt);
        String decrypt = AESAlgorithm.decryptData(encrypt,key);
        tvDecrypt.setText(decrypt);
    }
}
