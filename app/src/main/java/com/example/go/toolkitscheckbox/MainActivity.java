package com.example.go.toolkitscheckbox;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {


    private AlertDialog.Builder alert;
    private CheckBox apples;
    private CheckBox oranges;
    private CheckBox dragonfruit;
private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apples = (CheckBox) findViewById(R.id.apples);
        oranges = (CheckBox) findViewById(R.id.oranges);
        dragonfruit = (CheckBox) findViewById(R.id.dragonfruit);

        button = (Button) findViewById(R.id.button);

  button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          alert = new AlertDialog.Builder(MainActivity.this);

          StringBuilder StringBuilder = new StringBuilder();
          StringBuilder.append(apples.getText().toString() + "status is " + apples.isChecked() + "\n" );
          StringBuilder.append(oranges.getText().toString() +  "status is " + oranges.isChecked() + "\n");
          StringBuilder.append(dragonfruit.getText().toString() + "status is " + dragonfruit.isChecked() + "\n");

//  Build Alert Dialogue

          alert.setTitle(getResources().getString(R.string.title));

          alert.setMessage(getResources().getString(R.string.message));

          alert.setCancelable(false);

          alert.setPositiveButton(getResources().getString(R.string.yes),
                  new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialog, int which) {
                          MainActivity.this.finish();
                      }
                  });

   alert.setNegativeButton(getResources().getString(R.string.No), new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
           dialog.cancel();
       }
   });


          AlertDialog dialog = alert.create();



      }
  });

    }
}
