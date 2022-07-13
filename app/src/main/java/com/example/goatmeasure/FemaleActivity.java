package com.example.goatmeasure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FemaleActivity extends AppCompatActivity {
    private CardView calculateBtn;
    private TextView weightScore;
    private TextView carcweightScoref;
    EditText chestgirth;
    String calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);
        chestgirth = findViewById(R.id.txtchestgirth);
        weightScore = findViewById(R.id.txtweightscoref);
        carcweightScoref = findViewById(R.id.txtcarcweightscoref);

        calculateBtn = findViewById(R.id.calculatefemaleBtn);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1 = chestgirth.getText().toString();

                float chestgval = Float.parseFloat(S1);

                float weightfscore = (float) (-27.15 + (0.908 * chestgval));

                weightScore.setText(String.valueOf(weightfscore));

                float weightcarcscoref = (float) (0.46 * weightfscore);

                carcweightScoref.setText(String.valueOf(weightcarcscoref));

            }
        });
    }
}