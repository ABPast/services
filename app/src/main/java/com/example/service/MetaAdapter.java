package com.example.service;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MetaAdapter extends RecyclerView.Adapter<MetaAdapter.MetaViewHolder> implements AdapterView.OnItemClickListener {
    /**
     * Lista de objetos {@link Meta} que representan la fuente de datos
     * de inflado
     */
    private List<Meta> items;
    /*
    Contexto donde actua el recycler view
    */
    private Context context;
    public MetaAdapter(List<Meta> items, Context context) {
        this.context = context;
        this.items = items;
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    @Override
    public MetaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list, viewGroup, false);
        return new MetaViewHolder(v, this);
    }
    @Override
    public void onBindViewHolder(MetaViewHolder viewHolder, int i) {
        viewHolder.titulo.setText(items.get(i).getTitulo());
        viewHolder.prioridad.setText(items.get(i).getPrioridad());
        viewHolder.fechaLim.setText(items.get(i).getFechaLim());
        viewHolder.categoria.setText(items.get(i).getCategoria());
    }
    /**
     * Sobrescritura del método de la interfaz {@link OnItemClickListener}
     *
     * @param view item actual
     * @param position posición del item actual
     */
    @Override
    public void onItemClick(View view, int position) {
        DetailActivity.launch(
                (Activity) context, items.get(position).getIdMeta());
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        void onItemClick(View view, position);
    }

    public static class MetaViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Campos respectivos de un item
        public TextView titulo;
        public TextView prioridad;
        public TextView fechaLim;
        public TextView categoria;
        public AdapterView.OnItemClickListener listener;
        public MetaViewHolder(View v, MetaAdapter listener) {
            super(v);
            titulo = (TextView) v.findViewById(R.id.titulo);
            prioridad = (TextView) v.findViewById(R.id.prioridad);
            fechaLim = (TextView) v.findViewById(R.id.fecha);
            categoria = (TextView) v.findViewById(R.id.categoria);
            this.listener = listener;
            v.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            listener.onItemClick(v, getAdapterPosition());
        }
    }
}
