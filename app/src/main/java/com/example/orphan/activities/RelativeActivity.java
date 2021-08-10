package com.example.orphan.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import com.example.orphan.R;
import com.example.orphan.adapters.UserAdapter;
import com.example.orphan.models.User;

import java.util.ArrayList;
import java.util.List;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v-> onBackPressed());

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Peter Parker", 57));
        users.add(new User(2, "Clark Kent", 45));
        ListView listView = findViewById(R.id.listview);
        UserAdapter adapter = new UserAdapter(this, users);
        listView.setAdapter(adapter);
    }
}