package com.brioal.styleabletoasttest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        StyleableToast st = new StyleableToast(this, "Updating profile", Toast.LENGTH_LONG);
        st.setBackgroundColor(Color.parseColor("#ff5a5f"));
        st.setTextColor(Color.WHITE);
        st.setIcon(R.mipmap.ic_launcher);
        st.spinIcon();
        st.setMaxAlpha();
        st.show();
    }
}
