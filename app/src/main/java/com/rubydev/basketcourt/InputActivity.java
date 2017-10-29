package com.rubydev.basketcourt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
    Button btnCreate;
    EditText edtTeamA, edtTeamB;
    String teamA, teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        btnCreate = findViewById(R.id.btnCreate);
        edtTeamA = findViewById(R.id.edtTeamA);
        edtTeamB = findViewById(R.id.edtTeamB);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InputActivity.this, ScoreActivity.class);
                teamA = edtTeamA.getText().toString();
                teamB = edtTeamB.getText().toString();
                intent.putExtra("teamA", teamA);
                intent.putExtra("teamB", teamB);
                startActivity(intent);
            }
        });
    }
}
