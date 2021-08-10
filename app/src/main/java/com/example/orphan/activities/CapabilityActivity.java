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

public class CapabilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capability);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v-> onBackPressed());

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Jill Smith", 12));
        users.add(new User(2, "Eve Jackson", 15));
        users.add(new User(3, "Ema Jackson", 11));
        users.add(new User(4, "Asha Kamal", 17));
        users.add(new User(5, "Hridoy Rahman", 6));
        users.add(new User(6, "Alo Arfan", 10));
        users.add(new User(7, "Aurun Das", 10));
        users.add(new User(8, "Anu Atik", 10));
        users.add(new User(9, "Anu Islam", 10));
        users.add(new User(10, "Atik Hasan", 10));

        ListView listView = findViewById(R.id.listview);
        UserAdapter adapter = new UserAdapter(this, users);
        listView.setAdapter(adapter);
    }
}