package com.example.actividad1semana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    EditText edituser,editpassword;
    Button limpiarbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
     {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        limpiarbtn=(Button)findViewById(R.id.clear);
        edituser=(EditText)findViewById(R.id.nameuser);
        editpassword=(EditText)findViewById(R.id.userpwd);


        //evento para limpar la info de los EditText
        limpiarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edituser.setText("");
                editpassword.setText("");
            }
        });



     }

     //Metodo para valiar password y contrase;a
    public void Validacion_Total (View view) {
        String nombre_user = edituser.getText().toString();
        String valid_password = editpassword.getText().toString();
        //  nombre_user="willis";
           // valid_password="1234";
        //validar password y contrase;a
        if (nombre_user.equals("willis") &&  valid_password.equals("1234")) {
            Intent vdatos = new Intent(MainActivity.this, validardatos.class);
            startActivity(vdatos);
        }else{
            Toast.makeText(this,"El campo User o Password es incorrecto",Toast.LENGTH_LONG).show();
        }
        //validar password
        if (valid_password.length() == 0) {

           // Toast.makeText(this, "Las crendenciales son incorrectas\u201d, Toast.LENGTH_LONG).show();
            Toast.makeText(this,"Favor llenar el campo password",Toast.LENGTH_LONG).show();
        }
        //validar nombre de usuario

        if (nombre_user.length() == 0) {

            // Toast.makeText(this, "Las crendenciales son incorrectas\u201d, Toast.LENGTH_LONG).show();
            Toast.makeText(this,"Favor llenar el campo user",Toast.LENGTH_LONG).show();
        }

    }

  //  metodo para limpiar
    public void limpia()
    {


    }

}
