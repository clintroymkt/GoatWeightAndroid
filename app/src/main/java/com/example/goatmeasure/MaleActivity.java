package com.example.goatmeasure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MaleActivity extends AppCompatActivity {
    private CardView calculateBtn;
    private TextView weightScore;
    private TextView carcweightScore;
    EditText chestgirth;
    String calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male);

        chestgirth = findViewById(R.id.txtchestgirth);
        weightScore = findViewById(R.id.txtweightscorem);
        carcweightScore = findViewById(R.id.txtcarcweightscorem);

        calculateBtn = findViewById(R.id.calculatemaleBtn);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1 = chestgirth.getText().toString();

                float chestgval = Float.parseFloat(S1);

                float weightfscore = (float) (-28.79 + (0.949 * chestgval));

                weightScore.setText(String.valueOf(weightfscore));

                float weightcarcscore = (float) (0.46 * weightfscore);

                carcweightScore.setText(String.valueOf(weightcarcscore));


            }
        });
    }
}