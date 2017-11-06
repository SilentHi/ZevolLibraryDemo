package com.zevol.library.listener;

import android.animation.Animator;

/**
 * 动画播放的事件监听器<br/>
 * GitHub: https://github.com/SilentHi/ZevolLibraryDemo.git<br/>
 * E_mail: 212448124@qq.com<br/>
 * Created by Zevol on 2017/11/6 0006.
 */
public abstract class ZLAnimatorListener implements Animator.AnimatorListener {
    @Override
    public void onAnimationStart(Animator animation) {

    }

    @Override
    public void onAnimationEnd(Animator animation) {
        animationEnd();
    }

    /**
     * 动画结束后需要执行的操作
     */
    public abstract void animationEnd();

    @Override
    public void onAnimationCancel(Animator animation) {

    }

    @Override
    public void onAnimationRepeat(Animator animation) {

    }
}