package com.dbqf.sometextviews.demo.ui;

import android.app.Activity;
import android.os.Bundle;

import com.dbqf.sometextviews.demo.R;
import com.dbqf.sometextviews.library.widgets.VerticalScrollTextView;

/**
 * Created by qingfeng on 16/3/23.
 */
public class MainActivity extends Activity {

    VerticalScrollTextView verticalScrollTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
