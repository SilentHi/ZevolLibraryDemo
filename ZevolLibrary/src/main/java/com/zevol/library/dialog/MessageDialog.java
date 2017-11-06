package com.zevol.library.dialog;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;

import com.blankj.utilcode.util.ScreenUtils;
import com.zevol.library.R;
import com.zevol.library.listener.OnMessageDialogSureListener;

/**
 * 展示信息的弹框<br/>
 * GitHub: https://github.com/SilentHi/ZevolLibraryDemo.git<br/>
 * E_mail: 212448124@qq.com<br/>
 * Created by Zevol on 2017/11/6 0006.
 */
public class MessageDialog extends BaseDialog{
    AppCompatTextView tvMessageDialogTitle;
    AppCompatTextView tvMessageDialogContent;
    View vMessageDialogVerticalDivider;
    AppCompatButton btnMessageDialogSure;

    private OnMessageDialogSureListener mOnMessageDialogSureListener;//确认按钮的点击事件

    /**
     * 构造方法 来实现 最基本的对话框
     *
     * @param context 上下文
     */
    public MessageDialog(Context context, String messageDialogTitle, String messageDialogContent) {
        super(context);
        tvMessageDialogTitle.setText(messageDialogTitle);
        String htmlContent = "<p><pre>" + messageDialogContent.replace("\r\n", "<br/>").replace("\n", "<br/>") + "</pre></p>";
        tvMessageDialogContent.setText(Html.fromHtml(htmlContent));
    }

    @Override
    protected int getDialogStyleId() {
        return R.style.dialogStyle;
    }

    @Override
    protected View bindViews() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.alert_dialog_message, null);
        tvMessageDialogTitle = view.findViewById(R.id.tvMessageDialogTitle);
        tvMessageDialogContent = view.findViewById(R.id.tvMessageDialogContent);
        vMessageDialogVerticalDivider = view.findViewById(R.id.vMessageDialogVerticalDivider);
        btnMessageDialogSure = view.findViewById(R.id.btnMessageDialogSure);
        return view;
    }

    @Override
    protected void bindDialogData() {
        tvMessageDialogContent.setMovementMethod(ScrollingMovementMethod
                .getInstance());
        tvMessageDialogContent.setMaxHeight((int) (ScreenUtils.getScreenWidth() * 0.9));
    }

    @Override
    protected void bindDialogListeners() {

    }

    @Override
    protected void onClick(int id) {
        if (id == R.id.btnMessageDialogSure) {
            dismiss();
            mOnMessageDialogSureListener.messageSure();
        }
    }

    /**
     * 设置确定按钮的文字，如果不设置，默认为“确认”
     *
     * @param buttonText 文本文字
     */
    public void setSureButtonText(String buttonText) {
        btnMessageDialogSure.setText(buttonText);
    }

    public void setOnMessageDialogSureListener(OnMessageDialogSureListener onMessageDialogSureListener) {
        this.mOnMessageDialogSureListener = onMessageDialogSureListener;
    }
}
