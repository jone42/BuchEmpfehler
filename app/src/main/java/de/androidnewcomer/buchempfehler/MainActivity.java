package de.androidnewcomer.buchempfehler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        String text = "Ich empfehle Dir folgendes Buch: 'Android Apps entwickeln für Einsteiger' von Uwe Post."
                + " Hier ist der Link: https://www.rheinwerk-verlag.de/android-apps-entwickeln-fur-einsteiger_4869/";

        Intent i = new Intent();
        i.setAction(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TEXT, text);
        i.setType("text/plain");
        startActivity( Intent.createChooser(i,"Buchempfehlung senden an..."));

    }
}
