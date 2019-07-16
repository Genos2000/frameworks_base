package com.android.keyguard.clocks;

import android.content.Context;
import android.graphics.Canvas;
import android.provider.Settings;
import android.util.AttributeSet;

import com.android.systemui.R;

public class CustomTextClockHeader extends CustomTextClock {

    private Context mContext;

    public CustomTextClockHeader(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;
    }

    @Override
    protected String getTimeString(int hour, int minute) {
        if(hour < 2)
            return getResources().getString(R.string.text_clock_header_singular);
        else
            return getResources().getString(R.string.text_clock_header_plural);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
