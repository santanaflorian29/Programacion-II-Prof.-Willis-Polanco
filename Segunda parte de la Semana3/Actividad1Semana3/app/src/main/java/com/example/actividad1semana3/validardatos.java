package com.example.actividad1semana3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class validardatos extends AppCompatActivity {

    //declaracion de nuestro array para los estudiantes
    ArrayList<Estudiantes> listaEstudiantesonMain;
    RecyclerView recyclerViewEstudiantesUNIBE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validardatos);

        //segunda etapa de la practica

        listaEstudiantesonMain= new ArrayList<>();
        recyclerViewEstudiantesUNIBE=(RecyclerView)findViewById(R.id.myrecyclerview);
        recyclerViewEstudiantesUNIBE.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        llenarEstudiantes();

        AdaptadorEstudiantes adapter= new AdaptadorEstudiantes(listaEstudiantesonMain);

        //crear adaptador para ver perfil
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
//                if (listaEstudiantesonMain.add()==""){}
            }
        });

        recyclerViewEstudiantesUNIBE.setAdapter(adapter);




    }
    private void llenarEstudiantes() {
        listaEstudiantesonMain.add(new Estudiantes("Jhonathan Santana",R.drawable.jasf));
        listaEstudiantesonMain.add(new Estudiantes("Loida Pimentel",R.drawable.loida));
        listaEstudiantesonMain.add(new Estudiantes("Eulises Sepulveda",R.drawable.eulises));
        listaEstudiantesonMain.add(new Estudiantes("Luis Liranzo",R.drawable.luis));
        listaEstudiantesonMain.add(new Estudiantes("Arturo de Jesus",R.drawable.arturo));
        listaEstudiantesonMain.add(new Estudiantes("Leigzip Guzman",R.drawable.dir));
        listaEstudiantesonMain.add(new Estudiantes("Jesus Benedetti",R.drawable.jesus));
    }
}
