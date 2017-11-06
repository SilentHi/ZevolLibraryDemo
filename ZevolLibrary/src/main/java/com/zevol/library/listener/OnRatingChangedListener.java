package com.zevol.library.listener;

import android.support.annotation.FloatRange;

import com.zevol.library.widget.ZLRatingBar;

/**
 * RatingBar 的事件监听器<br/>
 * GitHub: https://github.com/SilentHi/ZevolLibraryDemo.git<br/>
 * E_mail: 212448124@qq.com<br/>
 * Created by Zevol on 2017/11/6 0006.
 */
public interface OnRatingChangedListener {
    /**
     * 评分变化时的回调方法
     *
     * @param mpRatingBar 绑定此方法的控件
     * @param rating      评分
     */
    void onRatingChanged(ZLRatingBar mpRatingBar, @FloatRange(from = 0f, to = 1.f) float rating);
}
