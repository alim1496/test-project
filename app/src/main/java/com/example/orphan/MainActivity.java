package com.example.orphan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.orphan.activities.AgeActivity;
import com.example.orphan.activities.CapabilityActivity;
import com.example.orphan.activities.LocationActivity;
import com.example.orphan.activities.OpportunityActivity;
import com.example.orphan.activities.RelativeActivity;
import com.example.orphan.activities.SafetyActivity;

public class MainActivity extends AppCompatActivity {

    private Button location, relative, capability, opportunity, age, safety;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        location = findViewById(R.id.location);
        relative = findViewById(R.id.relative);
        capability = findViewById(R.id.capability);
        opportunity = findViewById(R.id.opportunity);
        age = findViewById(R.id.age);
        safety = findViewById(R.id.safety);

        goToActivity();
    }

    private void goToActivity() {
        location.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LocationActivity.class);
            startActivity(intent);
        });

        relative.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
            startActivity(intent);
        });

        capability.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CapabilityActivity.class);
            startActivity(intent);
        });

        opportunity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OpportunityActivity.class);
            startActivity(intent);
        });

        age.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AgeActivity.class);
            startActivity(intent);
        });

        safety.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SafetyActivity.class);
            startActivity(intent);
        });
    }
}