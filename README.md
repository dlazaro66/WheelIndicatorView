WheelIndicatorView [![Build Status](https://travis-ci.org/dlazaro66/WheelIndicatorView.svg?branch=master)](https://travis-ci.org/dlazaro66/WheelIndicatorView)
===
A 'Google Fit' like activity indicator for Android

Screenshots
-----------

![Image](../master/art/animated_wheelview.gif?raw=true)

Usage
-----

How to use:

- Add a "WheelIndicatorView" in the layout editor like you actually do with a button for example

```xml
 <com.dlazaro66.wheelindicatorview.WheelIndicatorView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/wheel_indicator_view"
        app:itemsLineWidth="13dp"
        app:filledPercent="40"
        app:backgroundColor="@color/white"
        />
```
- You can set different attributes just as:

	- Lines size: WheelIndicatorView:itemsLineWidth
	- Inner circle background color: WheelIndicatorView:backgroundColor
	- % of circle filled: WheelIndicatorView:filledPercent


- Also, you can declare it programmatically:
```
 WheelIndicatorView wheelIndicatorView = new WheelIndicatorView(context);
```

- Then add elements to the indicator view, declaring as many WheelIndicatorItem objects as you want:
```
 WheelIndicatorItem bikeActivityIndicatorItem = new WheelIndicatorItem(1.5f , Color.parseColor("#FF5722"));
```
- Every ``` WheelIndicatorItem ``` should have a _weight_ and the chart will draw it as needed, comparing all data set.

- If data set changed, you should call ``` wheelIndicatorView.notifyDataSetChanged() ``` as you would do with an adapter.

- Animate the chart once you added all your elements with ``` wheelIndicatorView.startItemsAnimation() ``` 

- If you don't want your chart to be completed at 100% (for example if you're representing user fitness activity and daily target is only done at 35%) you should call ``` wheelIndicatorView.setFilledPercent(35) ``` 


Do you want to contribute?
--------------------------

Please send a PR or open an issue with your comments!

Developed By
------------

* David Lázaro Esparcia - <dlazaro66@gmail.com>

<a href="https://twitter.com/_dlazaro">
  <img alt="Follow me on Twitter" src="http://imageshack.us/a/img812/3923/smallth.png" />
</a>
<a href="https://www.linkedin.com/pub/david-l%C3%A1zaro-esparcia/">
  <img alt="Add me to Linkedin" src="http://imageshack.us/a/img41/7877/smallld.png" />
</a>


Who's using it
--------------

*Does your app use WheelIndicatorView? If you want to be featured on this list drop me a line.*

Contributors
------------
* [David Lázaro Esparcia][1]

License
-------

    Copyright 2015 David Lázaro

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[1]: https://github.com/dlazaro66
