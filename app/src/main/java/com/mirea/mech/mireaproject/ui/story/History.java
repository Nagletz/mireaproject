package com.mirea.mech.mireaproject.ui.story;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.mirea.mech.mireaproject.R;

public class History extends Fragment {
    private RecyclerView stories;
    private com.mirea.mech.mireaproject.ui.story.AdapterCell adapterCell;
    List<com.mirea.mech.mireaproject.ui.story.Cell> listStories;

    public History() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_histoty, container, false);
        com.mirea.mech.mireaproject.ui.story.AppDatabase db = com.mirea.mech.mireaproject.ui.story.App.getInstance().getDatabase();
        HistoryDao historyDao = db.storyDao();
        stories = view.findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        stories.setLayoutManager(layoutManager);
        stories.setHasFixedSize(true);
        listStories = historyDao.getAll();
        adapterCell = new com.mirea.mech.mireaproject.ui.story.AdapterCell(listStories);
        stories.setAdapter(adapterCell);
        return view;
    }
}