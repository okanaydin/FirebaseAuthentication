package com.example.okanaydin.firebaseauthentication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class UyeOl extends AppCompatActivity {

    private EditText uyeEmail,uyeParola;
    private Button yeniUyeButton,uyeGirisButton;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_ol);

        //FirebaseAuth sınıfının referans olduğu nesneleri kullanmak için getInstance methodunu kullanıyoruz.
        auth=FirebaseAuth.getInstance();

        uyeEmail=(EditText)findViewById(R.id.uyeEmail);
        uyeParola=(EditText)findViewById(R.id.uyeParola);
        yeniUyeButton=(Button)findViewById(R.id.yeniUyeButton);
        uyeGirisButton=(Button)findViewById(R.id.uyeGirisButton);

        yeniUyeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email=uyeEmail.getText().toString();
                String parola=uyeParola.getText().toString();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(),"Mail adresinizi giriniz",Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(parola)){
                    Toast.makeText(getApplicationContext(),"Parola giriniz",Toast.LENGTH_LONG).show();
                }

                if (parola.length()<8){
                    Toast.makeText(getApplicationContext(),"Parola en az 8 karakterden oluşmalıdır",Toast.LENGTH_LONG).show();
                }




            }
        });





    }
}
