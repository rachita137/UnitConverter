package tatastrive.application.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring Widgets
    
    EditText editText;
    TextView textView, textView2, textView4, valueinPounds;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiating Widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueinPounds = findViewById(R.id.valueOfPounds);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);


        // Adding A Click event for button (Executing the convert method when clicked)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Calling ConvertFromKiloToPound Method

                ConvertFromKiloToPound();

            }
        });



    }

    private void ConvertFromKiloToPound() {
        // This method will convert the values entered in editText
        // From Kilo to pounds

        String valueEnteredinKILO = editText.getText().toString();

        //converting string to number
        double Kilo = Double.parseDouble(valueEnteredinKILO);

        // converting kilo to pounds formula
        double pounds = Kilo * 2.205;

        // Displaying the value resulted in textView
        valueinPounds.setText("" + pounds);



    }
}
