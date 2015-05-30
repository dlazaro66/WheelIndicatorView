package com.dlazaro66.wheelindicatorview;

import org.junit.Test;

/**
 * Created by david on 25/5/15.
 */
public class WheelIndicatorItemTest{

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenWeightIsNegative(){
        int color = 0x0000000;
        WheelIndicatorItem item = new WheelIndicatorItem(-1, color);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setterShouldThrowExceptionWhenWeightIsNegative(){
        WheelIndicatorItem item = new WheelIndicatorItem();
        item.setWeight(-1);
    }
}
