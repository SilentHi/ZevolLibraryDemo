package com.zevol.library.net;

/**
 * EasyHttp 请求的事件监听类<br/>
 * GitHub: https://github.com/SilentHi/ZevolLibraryDemo.git<br/>
 * E_mail: 212448124@qq.com<br/>
 * Created by Zevol on 2017/11/6 0006.
 */
public interface OnEasyHttpListener {
    /**
     * 请求成功
     *
     * @param s 成功返回的字符串
     */
    void onSuccess(String s);

    /**
     * 请求失败
     *
     * @param e 失败信息
     */
    void onFailed(Exception e);
}
