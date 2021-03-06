package com.vladborisov.demorecyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ElementItemsAdapter extends RecyclerView.Adapter<ElementItemViewHolder> {
    private final LayoutInflater inflater;
    private final List<ElementItem> items;

    public ElementItemsAdapter(LayoutInflater inflater, List<ElementItem> items) {
        this.inflater = inflater;
        this.items = items;
    }

    @NonNull
    @Override
    public ElementItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("DEBUG", "onCreateViewHolder" + viewType);
        return new ElementItemViewHolder(inflater.inflate(R.layout.item_element, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ElementItemViewHolder holder, int position) {
        Log.d("DEBUG", "onBindViewHolder" + position);
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
