package PROJECT_TLD.PROJECT_DOMAIN.PROJECT_NAME;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button evaluateButton = (Button)findViewById(R.id.evaluateButton);
        evaluateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputTextField = (EditText)findViewById(R.id.inputField);
                TextView resultText = (TextView)findViewById(R.id.evaluatedResult);
                resultText.setText(evaluate(inputTextField.getText().toString()));
            }
        });
    }

    private String evaluate(String input) {
        return input;
    }
}
