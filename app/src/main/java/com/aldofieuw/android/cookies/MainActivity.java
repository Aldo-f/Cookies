package com.aldofieuw.android.cookies;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView changeCookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        changeCookieImageView.setImageResource(R.drawable.after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView changeCookieTextView = (TextView) findViewById(R.id.status_text_view);
        changeCookieTextView.setText("I am Totally full");

        // TODO: Disable button when clicked
        Button changeCookieButton = (Button) findViewById(R.id.android_cookie_button);
        changeCookieButton.setEnabled(false);

    }
}
