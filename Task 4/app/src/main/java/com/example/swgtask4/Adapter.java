package com.example.swgtask4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;

// FirebaseRecyclerAdapter is a class provided by
// FirebaseUI. it provides functions to bind, adapt and show
// database contents in a Recycler View
public class Adapter extends FirebaseRecyclerAdapter<NewClass, Adapter.NewClassViewHolder> {

    public Adapter(
            @NonNull FirebaseRecyclerOptions<NewClass> options)
    {
        super(options);
    }


    @Override
    protected void onBindViewHolder(@NonNull NewClassViewHolder newClassViewHolder, int i, @NonNull NewClass newClass) {
        newClassViewHolder.setName(newClass.getName());
        newClassViewHolder.setDesc(newClass.getDescription());
        newClassViewHolder.setLogo(newClass.getLogo()); // Probably there is a mistake here
    }

    @NonNull
    @Override
    public NewClassViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent,
                       int viewType)
    {
        View view
                = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);
        return new Adapter.NewClassViewHolder(view);
    }

    public static class NewClassViewHolder extends RecyclerView.ViewHolder
    {
        View mView;
        public NewClassViewHolder(View itemView)
        {
            super(itemView);
            mView = itemView;
        }
        public void setName(String name)
        {
            TextView socName = (TextView)mView.findViewById((R.id.societyname));
            socName.setText(name);
        }
        public void setDesc(String desc)
        {
            TextView socDesc = (TextView)mView.findViewById((R.id.societydescription));
            socDesc.setText(desc);
        }
        public void setLogo (String image)
        {
            ImageView societyLogo = (ImageView) mView.findViewById((R.id.societyimage));
            Picasso.get().load(image).into(societyLogo);
        }
    }
}