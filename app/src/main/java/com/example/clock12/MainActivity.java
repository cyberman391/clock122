package com.example.clock12;

import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getGMTTime();
        getlaTime();
        getparisTime();
        gettokyoTime();
        getNYCTime();
        //changetime
        Button button1 = findViewById(R.id.change_format);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("hh:mm a");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("GMT+01:00"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article);
                textview.setText(time);
            }
        });
        Button button2 = findViewById(R.id.change_format2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("GMT+01:00"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article);
                textview.setText(time);
            }
        });
        Button button3 = findViewById(R.id.change_format3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("hh:mm a");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article2);
                textview.setText(time);
            }
        });
        Button button4 = findViewById(R.id.change_format4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article2);
                textview.setText(time);
            }
        });
        Button button5 = findViewById(R.id.change_format5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("hh:mm a");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article3);
                textview.setText(time);
            }
        });
        Button button6 = findViewById(R.id.change_format6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article3);
                textview.setText(time);
            }
        });
        Button button7 = findViewById(R.id.change_format9);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("hh:mm a");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article4);
                textview.setText(time);
            }
        });
        Button button8 = findViewById(R.id.change_format10);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article4);
                textview.setText(time);
            }
        });
        Button button9 = findViewById(R.id.change_format11);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("hh:mm a");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article5);
                textview.setText(time);
            }
        });
        Button button10 = findViewById(R.id.change_format11);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewl) {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                Date date = new Date();
                format.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                String time = " " + (format.format(date));

                TextView textview = findViewById(R.id.article5);
                textview.setText(time);
            }
        });
    }

    public void getGMTTime() {
        TextView article = findViewById(R.id.article);
        SimpleDateFormat sdf = new SimpleDateFormat("dd HH:mm:ss");
        Date date = new Date();
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String gmtTime = (sdf.format(date));
        article.setText(gmtTime);
    }
    public void getlaTime() {
        TextView article = findViewById(R.id.article2);
        SimpleDateFormat sdf = new SimpleDateFormat("dd HH:mm:ss");
        Date date = new Date();
        sdf.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String gmtTime = (sdf.format(date));
        article.setText(gmtTime);
    }
    public void getparisTime() {
        TextView article = findViewById(R.id.article3);
        SimpleDateFormat sdf = new SimpleDateFormat("dd HH:mm:ss");
        Date date = new Date();
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        String gmtTime = (sdf.format(date));
        article.setText(gmtTime);
    }
    public void gettokyoTime() {
        TextView article = findViewById(R.id.article4);
        SimpleDateFormat sdf = new SimpleDateFormat("dd HH:mm:ss");
        Date date = new Date();
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        String gmtTime = (sdf.format(date));
        article.setText(gmtTime);
    }
    public void getNYCTime() {
        TextView article = findViewById(R.id.article5);
        SimpleDateFormat sdf = new SimpleDateFormat("dd HH:mm:ss");
        Date date = new Date();
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String gmtTime = (sdf.format(date));
        article.setText(gmtTime);
    }
}
