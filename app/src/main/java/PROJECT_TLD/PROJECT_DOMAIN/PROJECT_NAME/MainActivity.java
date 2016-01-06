
// PROJECT_NAME - PROJECT_SHORT_DESCRIPTION
//
// Written in PROJECT_COPY_YEAR by PROJECT_AUTHOR PROJECT_CONTACT_EMAIL
//
// To the extent possible under law, the author(s) have dedicated all copyright
// and related and neighboring rights to this software to the public domain worldwide.
// This software is distributed without any warranty.
//
// You should have received a copy of the CC0 Public Domain Dedication along with this software.
// If not, see <http://creativecommons.org/publicdomain/zero/1.0/>.

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
