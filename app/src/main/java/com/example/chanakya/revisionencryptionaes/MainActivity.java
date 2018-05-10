package com.example.chanakya.revisionencryptionaes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String value = "hello guys ";
    String message = "encryption is done";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String encryptedData = AESHelper.encrypt(value, message);
            Log.e("EncryptDecrypt", "Encoded String " + encryptedData);
            String decryptedData = AESHelper.decrypt(value, encryptedData);
            Log.e("EncryptDecrypt", "Decoded String " + decryptedData);

        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}
