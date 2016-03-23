package com.dbqf.sometextviews.library.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import com.dbqf.sometextviews.library.R;

/**
 * Created by qingfeng on 16/3/23.
 */
public class VerticalScrollTextView extends LinearLayout {

    private ViewFlipper viewFlipper;
    private Context mContext;
    private View scrollTitleView;

    public VerticalScrollTextView(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    public VerticalScrollTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init();
    }

    public VerticalScrollTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init();
    }

    private void init() {
        scrollTitleView = LayoutInflater.from(mContext).inflate(
                R.layout.tv_vertical_scroll, null);
        LayoutParams layoutParams = new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        addView(scrollTitleView, layoutParams);
        viewFlipper = (ViewFlipper) scrollTitleView
                .findViewById(R.id.flipper_scrollTitle);
        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.slide_in_top));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext, R.anim.slide_in_bottom));
        viewFlipper.startFlipping();
    }

}
