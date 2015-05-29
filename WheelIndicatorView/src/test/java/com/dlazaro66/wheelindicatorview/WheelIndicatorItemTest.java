package com.dlazaro66.wheelindicatorview;

import android.graphics.Color;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by david on 25/5/15.
 */
public class WheelIndicatorItemTest extends TestCase {

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionWhenWeightIsNegative(){
        WheelIndicatorItem item = new WheelIndicatorItem(-1, Color.parseColor("#aaffaa"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setterShouldThrowExceptionWhenWeightIsNegative(){
        WheelIndicatorItem item = new WheelIndicatorItem();
        item.setWeight(-1);
    }
}
