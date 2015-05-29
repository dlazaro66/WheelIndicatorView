package com.dlazaro66.sampleapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.dlazaro66.wheelindicatorview.WheelIndicatorItem;
import com.dlazaro66.wheelindicatorview.WheelIndicatorView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WheelIndicatorView wheelIndicatorView = (WheelIndicatorView) findViewById(R.id.wheel_indicator_view);

        //WheelIndicatorView wheelIndicatorView = new WheelIndicatorView(this);

        // dummy data
        float dailyKmsTarget = 3.5f; // 3.5 Km is the user target, for example
        float totalKmsDone = 3.0f; // User has done 3 Km
        int percentageOfExerciseDone = (int) (totalKmsDone/dailyKmsTarget * 100); //

        wheelIndicatorView.setFilledPercent(percentageOfExerciseDone);

        WheelIndicatorItem bikeActivityIndicatorItem = new WheelIndicatorItem(1.5f, Color.parseColor("#FF5722"));
        WheelIndicatorItem walkingActivityIndicatorItem = new WheelIndicatorItem(1, getResources().getColor(R.color.my_wonderful_blue_color));
        WheelIndicatorItem runningActivityIndicatorItem = new WheelIndicatorItem(0.5f, Color.argb(255, 102, 187, 106));

        wheelIndicatorView.addWheelIndicatorItem(runningActivityIndicatorItem);
        wheelIndicatorView.addWheelIndicatorItem(walkingActivityIndicatorItem);
        wheelIndicatorView.addWheelIndicatorItem(bikeActivityIndicatorItem);

        // Or you can add it as
        //wheelIndicatorView.setWheelIndicatorItems(Arrays.asList(runningActivityIndicatorItem,walkingActivityIndicatorItem,bikeActivityIndicatorItem));

        wheelIndicatorView.startItemsAnimation(); // Animate!
    }
}
