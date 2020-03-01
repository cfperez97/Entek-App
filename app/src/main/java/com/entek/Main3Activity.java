package com.entek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class Main3Activity extends AppCompatActivity {

    private Set<String> clientList;

    static final String CLIENT_LIST_KEY = "Client List";

    private SharedPreferences mPreferences;
    private String sharedPrefFileName =
            "com.entek";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mPreferences = getSharedPreferences(sharedPrefFileName, MODE_PRIVATE);

        clientList = mPreferences.getStringSet(CLIENT_LIST_KEY, null);
        if (clientList == null){
            clientList = new HashSet<>();
        }
    }

    public void back(View view){
        Intent moveToNextActivity = new Intent(this, MainActivity.class);
        startActivity(moveToNextActivity);
    }

    public void submit(View view){
        EditText editTextName = findViewById(R.id.editText);
        EditText editTextEmail = findViewById(R.id.editText2);
        EditText editTextPhoneNumber = findViewById(R.id.editText3);
        EditText editTextComment = findViewById(R.id.editText4);
        CheckBox checkBoxSoliciting = findViewById(R.id.checkBox);
        RadioButton radioButtonCommercial = findViewById(R.id.radioButton2);
        Client client = new Client(editTextName.getText().toString(),
                editTextEmail.getText().toString(), editTextPhoneNumber.getText().toString(),
                editTextComment.getText().toString(), checkBoxSoliciting.isChecked(),
                radioButtonCommercial.isChecked());
        clientList.add(client.toString());
        editTextName.setText("");
        editTextEmail.setText("");
        editTextPhoneNumber.setText("");
        editTextComment.setText("");
        checkBoxSoliciting.setChecked(false);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        Intent moveToNextActivity = new Intent(this, MainActivity.class);
        moveToNextActivity.putExtra("Name", client.getName());
        startActivity(moveToNextActivity);
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.putStringSet(CLIENT_LIST_KEY, clientList);
        preferencesEditor.apply();
    }
}
