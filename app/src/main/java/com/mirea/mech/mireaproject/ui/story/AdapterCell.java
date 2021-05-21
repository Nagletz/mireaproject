package com.mirea.mech.mireaproject.ui.story;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import com.mirea.mech.mireaproject.R;

public class AdapterCell extends RecyclerView.Adapter<AdapterCell.StoryHolder>{
    List<com.mirea.mech.mireaproject.ui.story.Cell> story;

    public AdapterCell(List<com.mirea.mech.mireaproject.ui.story.Cell> story){
        this.story = story;
    }

    @Override
    public StoryHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutId = R.layout.cell_layout;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutId, parent, false);
        StoryHolder storyHolder = new StoryHolder(view);
        return storyHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull StoryHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return story.size();
    }

    class StoryHolder extends RecyclerView.ViewHolder{
        TextView storyId;
        TextView storyText;

        public StoryHolder(View itemView) {
            super(itemView);

            storyId = itemView.findViewById(R.id.tv_id);
            storyText = itemView.findViewById(R.id.tv_text);
        }

        void bind(int listIndex){
            com.mirea.mech.mireaproject.ui.story.Cell cell = story.get(listIndex);
            storyId.setText(String.valueOf(cell.id));
            storyText.setText(cell.text);
        }
    }
}