package com.example.actividad1semana3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorEstudiantes extends
        RecyclerView.Adapter<AdaptadorEstudiantes.ViewHolderEstudiantes>
            //paso 1 para ver
            implements View.OnClickListener{

    ArrayList<Estudiantes> listaEstudiantes;
    //paso 3
    private View.OnClickListener viewperfil;

    public AdaptadorEstudiantes(ArrayList<Estudiantes> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @NonNull
    @Override
    public ViewHolderEstudiantes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_de_estudiantes,null,false);
      //paso 4
       view.setOnClickListener(this);
        return new ViewHolderEstudiantes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderEstudiantes holder, int position) {
            holder.etiNombre.setText(listaEstudiantes.get(position).getNombre());
        holder.foto.setImageResource(listaEstudiantes.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaEstudiantes.size();
    }

    public void setOnClickListener(View.OnClickListener listener)
    {
        this.viewperfil=listener;

    }

    //paso 2 para ver
    @Override
    public void onClick(View v)
    {
        if (viewperfil!=null)
        {
            viewperfil.onClick(v);
        }

        }

    public class ViewHolderEstudiantes extends RecyclerView.ViewHolder {
        TextView etiNombre;
        ImageView foto;

        public ViewHolderEstudiantes(@NonNull View itemView) {
            super(itemView);

            etiNombre=(TextView) itemView.findViewById(R.id.idNombre);
            foto=(ImageView) itemView.findViewById(R.id.idImagen1);

        }
    }
}
