package com.dlazaro66.wheelindicatorview;

import android.app.Activity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;

/**
 * Created by david on 30/5/15.
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class WheelIndicatorViewTest {

    private WheelIndicatorView wheelIndicatorView;

    @Before
    public void setUp() {
        Activity activity = Robolectric.buildActivity(Activity.class).create().resume().get();
        wheelIndicatorView = new WheelIndicatorView(activity);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setNullWheelIndicatorItemsThowsException() {
        wheelIndicatorView.setWheelIndicatorItems(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void addNullWheelIndicatorItemsThowsException() {
        wheelIndicatorView.addWheelIndicatorItem(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setNegativeLineWidthThowsException() {
        wheelIndicatorView.setItemsLineWidth(-2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setLineWidthToZeroThowsException() {
        wheelIndicatorView.setItemsLineWidth(0);
    }

    @Test
    public void setNegativeFilledPercentSetsPercentToZero() {
        wheelIndicatorView.setFilledPercent(-2);
        assertEquals(wheelIndicatorView.getFilledPercent(), 0);
    }
    @Test
    public void setFilledPercentOver100SetsPercentToZero() {
        wheelIndicatorView.setFilledPercent(150);
        assertEquals(wheelIndicatorView.getFilledPercent(), 100);
    }
}
