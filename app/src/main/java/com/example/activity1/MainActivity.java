package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListner();
    }
    //buttin click listner
    public void OnClickButtonListner(){
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                        Toast toast;
//                        Context context = getApplicationContext();
//                        CharSequence text = "Hi you clicked ,the Button.";
//                        int duration = Toast.LENGTH_SHORT;
//                        toast = Toast.makeText(context,text,duration);
//                        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
//                        toast.show();

                        setContentView(R.layout.activity_main);
//Creating the LayoutInflater instance
                        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
                        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                                findViewById(R.id.customtoast));
//Creating the Toast object
                        Toast toast = new Toast(getApplicationContext());
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                        toast.setView(layout);//setting the view of custom toast layout
                        toast.show();



                        Intent intent;
                        intent = new Intent(".Activity2");
                        startActivity(intent);
                    }
                }
        );
    }
}