package ru.kostya.tutorialtraining;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;
import com.tapadoo.alerter.Alert;
import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

public class MainActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private TextView result;
    private SwipeButton swipeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = findViewById(R.id.calendarView);
        result = findViewById(R.id.result);
        swipeButton = findViewById(R.id.swipe_btn);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                result.setText("Год : "  + year + "Месяц :" + month + "День : " + dayOfMonth);
            }
        });

        swipeButton.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                if (active){
                    Toast.makeText(MainActivity.this, "Active!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Dont Active!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void sliderActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SliderActivityCustom.class);
        startActivity(intent);
    }

    private void createAlerter(){
        Alerter.create(MainActivity.this)
                .setBackgroundColorRes(R.color.colorAccent)
                .setIcon(R.drawable.ic_baseline_favorite_24)
                .setText("Text text text text")
                .setTitle("Notification")
                .setDuration(3000)
                //Удаляет белый оттенок
                .setIconColorFilter(0)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Alerter was is clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnShowListener(new OnShowAlertListener() {
                    @Override
                    public void onShow() {
                        Toast.makeText(MainActivity.this, "Alerter is showed", Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnHideListener(new OnHideAlertListener() {
                    @Override
                    public void onHide() {
                        Toast.makeText(MainActivity.this, "Alert is hide", Toast.LENGTH_SHORT).show();
                    }
                })
                //Можно убрать свайпом
                .enableSwipeToDismiss()

                //По желанию добавляет прогресс бар
//               .enableProgress(true)
//               .setProgressColorRes(R.color.colorAccent)

                //Добавляет кнопки,сколько хочешь (нежелательно много)

//                .addButton("Okay", R.style.AlertButton, View.OnClickListener {
//            Toast.makeText(this@KotlinDemoActivity, "Okay Clicked", Toast.LENGTH_LONG).show()
//        })
//        .addButton("No", R.style.AlertButton, View.OnClickListener {
//            Toast.makeText(this@KotlinDemoActivity, "No Clicked", Toast.LENGTH_LONG).show()
//        })


                .show();
    }

    public void showAlerter(View view) {
        Alerter.create(MainActivity.this)
                .setBackgroundColorRes(R.color.colorAccent)
                .setIcon(R.drawable.ic_baseline_favorite_24)
                .setText("Text text text text")
                .setTitle("Notification")
                .setDuration(3000)
                //Удаляет белый оттенок
                .setIconColorFilter(0)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Alerter was is clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnShowListener(new OnShowAlertListener() {
                    @Override
                    public void onShow() {
                        Toast.makeText(MainActivity.this, "Alerter is showed", Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnHideListener(new OnHideAlertListener() {
                    @Override
                    public void onHide() {
                        Toast.makeText(MainActivity.this, "Alert is hide", Toast.LENGTH_SHORT).show();
                    }
                })
                //Можно убрать свайпом
                .enableSwipeToDismiss()
                .show();

                //По желанию добавляет прогресс бар
//               .enableProgress(true)
//               .setProgressColorRes(R.color.colorAccent)

                //Добавляет кнопки,сколько хочешь (нежелательно много)

//                .addButton("Okay", R.style.AlertButton, View.OnClickListener {
//            Toast.makeText(this@KotlinDemoActivity, "Okay Clicked", Toast.LENGTH_LONG).show()
//        })
//        .addButton("No", R.style.AlertButton, View.OnClickListener {
//            Toast.makeText(this@KotlinDemoActivity, "No Clicked", Toast.LENGTH_LONG).show()
//        })



    }
}