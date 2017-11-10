package com.zevol.library.demo.activity;

import com.blankj.ALog;
import com.blankj.utilcode.util.ToastUtils;
import com.zevol.library.activity.TopToolbarActivity;
import com.zevol.library.demo.R;
import com.zevol.library.demo.application.ZLDApplication;
import com.zevol.library.dialog.MessageDialog;
import com.zevol.library.listener.OnMessageDialogSureListener;
import com.zevol.library.widget.ZLPasswordEditText;

import butterknife.BindView;

public class MainActivity extends TopToolbarActivity {

    @BindView(R.id.etMain)
    ZLPasswordEditText etMain;

    @Override
    protected int bindLayoutId() {
        /*显示隐藏密码输入框、消息对话框、底部弹框、Adapter、Intent数据传递、其他自定义弹框、
         *碎片Fragment、延时任务、其他自定义底部弹框、RecyclerView示例*/
        return R.layout.activity_main;
    }

    @Override
    protected String bindTopToolbarTitle() {
        return "我的宝库";
    }

    @Override
    protected void onClick(int id) {
        super.onClick(id);
        switch (id) {
            case R.id.btnMessageDialog:
                ALog.e(etMain.getText().toString());
                showMessageDialog();
                break;
        }
    }

    /**
     * 展示消息对话框
     */
    private void showMessageDialog() {
        MessageDialog dialog = new MessageDialog(this, "消息提示", "消息内容");
        dialog.setSureButtonText("查看");
        dialog.setOnMessageDialogSureListener(new OnMessageDialogSureListener() {
            @Override
            public void messageSure() {
                ToastUtils.showShort("点击了查看消息按钮");
            }
        });
        dialog.show();
    }

    @Override
    protected void finishActivity() {
        ZLDApplication.getInstance().exitApp();
    }
}
