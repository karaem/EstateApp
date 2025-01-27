package com.example.estateapp.Adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.estateapp.Java.Property;
import com.example.estateapp.databinding.ItemPropertyTypeBinding;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.ViewHolder>{

    public List<Property> properties;

    public PropertyAdapter(List<Property> properties) {
        this.properties = properties;
    }

    @NonNull
    @Override
    public PropertyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPropertyTypeBinding binding = ItemPropertyTypeBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyAdapter.ViewHolder holder, int position) {
        Property property = properties.get(position);
        holder.binding.propertyName.setText(property.getName());
        holder.binding.propertyImage.setImageResource(property.getImageRes());

        holder.binding.getRoot().setOnClickListener(v -> {

        });

    }

    @Override
    public int getItemCount() {
        return properties.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemPropertyTypeBinding binding;
        public ViewHolder(@NonNull ItemPropertyTypeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
