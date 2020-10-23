package ru.kostya.tutorialtraining;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;

import java.util.ArrayList;
import java.util.List;

public class SliderActivityCustom extends AhoyOnboarderActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AhoyOnboarderCard oneCard = new AhoyOnboarderCard("Title1","Description1",R.drawable.ic_baseline_favorite_24);
        AhoyOnboarderCard twoCard = new AhoyOnboarderCard("Title1","Description1",R.drawable.ic_baseline_favorite_border_24);
        AhoyOnboarderCard freeCard = new AhoyOnboarderCard("Title1","Description1",R.drawable.ic_launcher_foreground);

        oneCard.setBackgroundColor(R.color.colorAccent);
        oneCard.setTitleColor(android.R.color.white);
        oneCard.setTitleTextSize(50);

        twoCard.setBackgroundColor(R.color.colorPrimaryDark);
        twoCard.setTitleColor(android.R.color.white);
        twoCard.setTitleTextSize(45);

        freeCard.setBackgroundColor(R.color.colorPrimary);
        oneCard.setTitleColor(android.R.color.white);

        List<AhoyOnboarderCard> pages = new ArrayList<>();
        pages.add(oneCard);
        pages.add(twoCard);
        pages.add(freeCard);

        //Название кнопки в конце
        setFinishButtonTitle("Начать");

        showNavigationControls(true);

        setGradientBackground();

        setOnboardPages(pages);
    }



    @Override
    public void onFinishButtonPressed() {
        Toast.makeText(this, "Finish Pressed", Toast.LENGTH_SHORT).show();
    }
}
