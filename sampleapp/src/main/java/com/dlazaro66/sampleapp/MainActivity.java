package com.dlazaro66.sampleapp;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;

import com.dlazaro66.wheelindicatorview.WheelIndicatorItem;
import com.dlazaro66.wheelindicatorview.WheelIndicatorView;


public class MainActivity extends Activity {

    private LinearGradient gradientOne;
    private LinearGradient gradientTwo;
    private int gradientAcitivtyPosition;
    private int gradientSwitch = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WheelIndicatorView wheelIndicatorView = (WheelIndicatorView) findViewById(R.id.wheel_indicator_view);

        //WheelIndicatorView wheelIndicatorView = new WheelIndicatorView(this);

        // dummy data
        float dailyKmsTarget = 4.0f; // 4.0Km is the user target, for example
        float totalKmsDone = 3.0f; // User has done 3 Km
        int percentageOfExerciseDone = (int) (totalKmsDone / dailyKmsTarget * 100); //

        wheelIndicatorView.setFilledPercent(percentageOfExerciseDone);

        gradientOne = new LinearGradient(0, 0, 0, dipTOpx(350), Color.parseColor("#ff9000"), Color.parseColor("#ee1000"), Shader.TileMode.REPEAT);
        gradientTwo = new LinearGradient(0, 0, 0, dipTOpx(350), Color.parseColor("#00ff90"), Color.parseColor("#00ee10"), Shader.TileMode.REPEAT);
        WheelIndicatorItem gradientActivityIndicatorItem = new WheelIndicatorItem(1.0f, gradientOne);
//        WheelIndicatorItem bikeActivityIndicatorItem = new WheelIndicatorItem(1.8f, Color.parseColor("#ff9000"));
//        WheelIndicatorItem walkingActivityIndicatorItem = new WheelIndicatorItem(0.9f, Color.argb(255, 194, 30, 92));
//        WheelIndicatorItem runningActivityIndicatorItem = new WheelIndicatorItem(0.3f, getResources().getColor(R.color.my_wonderful_blue_color));

        gradientAcitivtyPosition = wheelIndicatorView.addWheelIndicatorItem(gradientActivityIndicatorItem);
//        wheelIndicatorView.addWheelIndicatorItem(bikeActivityIndicatorItem);
//        wheelIndicatorView.addWheelIndicatorItem(walkingActivityIndicatorItem);
//        wheelIndicatorView.addWheelIndicatorItem(runningActivityIndicatorItem);

        // Or you can add it as
        //wheelIndicatorView.setWheelIndicatorItems(Arrays.asList(runningActivityIndicatorItem,walkingActivityIndicatorItem,bikeActivityIndicatorItem));

        wheelIndicatorView.startItemsAnimation(); // Animate!
        
        wheelIndicatorView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WheelIndicatorItem item = wheelIndicatorView.getWheelIndicatorItem(gradientAcitivtyPosition);
                switch (gradientSwitch){
                    case 1:
                        item.setGradient(gradientTwo);
                        gradientSwitch = 2;
                        break;
                    case 2:
                    default:
                        item.setGradient(gradientOne);
                        gradientSwitch = 1;
                        break;
                }
                wheelIndicatorView.replaceWheelIndicatorItemAndAnimate(gradientAcitivtyPosition,item);
            }
        });
    }

    public int dipTOpx(int dip) {
        int px = 0;
        px = Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, getResources().getDisplayMetrics()));
        return px;
    }

}
