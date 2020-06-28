package com.example.actividad1semana3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    EditText edituser,editpassword;
    Button limpiarbtn;
     //declaracion de nuestro array para los estudiantes
  //  ArrayList<Estudiantes> listaEstudiantesonMain;
  //  RecyclerView recyclerViewEstudiantesUNIBE;
    @Override
    protected void onCreate(Bundle savedInstanceState)
     {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //primera practica
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

        //segunda etapa de la practica

       //  listaEstudiantesonMain= new ArrayList<>();
      //   recyclerViewEstudiantesUNIBE=(RecyclerView)findViewById(R.id.myrecyclerview);
      //   recyclerViewEstudiantesUNIBE.setLayoutManager(new LinearLayoutManager(this));
         
      //   llenarEstudiantes();

      //   AdaptadorEstudiantes adapter= new AdaptadorEstudiantes(listaEstudiantesonMain);
     //    recyclerViewEstudiantesUNIBE.setAdapter(adapter);

     }

  //  private void llenarEstudiantes() {
     //   listaEstudiantesonMain.add(new Estudiantes("Jhonatha Santana",R.drawable.jasf));
      //  listaEstudiantesonMain.add(new Estudiantes("Loida Pimentel",R.drawable.loida));
      //  listaEstudiantesonMain.add(new Estudiantes("Eulises Sepulveda",R.drawable.eulises));
     //   listaEstudiantesonMain.add(new Estudiantes("Luis Liranzo",R.drawable.luis));
      //  listaEstudiantesonMain.add(new Estudiantes("Arturo de Jesus",R.drawable.arturo));
     //   listaEstudiantesonMain.add(new Estudiantes("Leigzip Guzman",R.drawable.dir));
     //   listaEstudiantesonMain.add(new Estudiantes("Jesus Benedetti",R.drawable.jesus));
  //  }

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
          //  llenarEstudiantes();
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



}
