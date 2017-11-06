package com.zevol.library.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;

import com.blankj.utilcode.util.ActivityUtils;

import java.util.List;

/**
 * 继承自BaseAdapter的abstract类，方便adapter代码的编写和规范。其他 Adapter 都应继承此类<br/>
 * ListView使用此Adapter<br/>
 * GitHub: https://github.com/SilentHi/ZevolLibraryDemo.git<br/>
 * E_mail: 212448124@qq.com<br/>
 * Created by Zevol on 2017/11/6 0006.
 */
public abstract class BaseAdapter<T> extends android.widget.BaseAdapter {

    protected Context mContext;//上下文
    protected LayoutInflater inflater;//导入布局文件的工具
    protected List<T> list;//数据集合

    /**
     * 构造函数
     *
     * @param context 上下文
     * @param list    数据集合
     */
    public BaseAdapter(Context context, List<T> list) {
        this.list = list;
        this.mContext = context;
        inflater = LayoutInflater.from(context);
    }

    /**
     * 返回 Item 项的个数
     *
     * @return Item 个数
     */
    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    /**
     * 返回当前位置 Item 项
     *
     * @param position 当前位置
     * @return 当前位置的 Item 项
     */
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    /**
     * 返回Item项的Id
     *
     * @param position 当前位置
     * @return 当前位置的 Item 的ID
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * 刷新list的数据
     *
     * @param list 新的 List 数据
     */
    public void refresh(List<T> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    /**
     * 添加一个数据到 list 中
     *
     * @param t 添加符合泛型的数据到 List 中
     */
    public void addSingleObject(T t) {
        if (list != null) {
            list.add(t);
            notifyDataSetChanged();
        }
    }

    /**
     * 获取当前的 List
     *
     * @return 当前的 List
     */
    public List<T> getDataList() {
        return list;
    }

    /**
     * 删除 List 的数据
     *
     * @param position 要删除的位置
     */
    public void deleteItemAtPosition(int position) {
        if (list != null && list.size() > position) {
            list.remove(position);
            notifyDataSetChanged();
        }
    }

    /**
     * 添加多个 List 的数据
     *
     * @param list 要添加的数据集合
     */
    public void addAllDataToList(List<T> list) {
        if (this.list == null) {
            this.list = list;
        } else {
            this.list.addAll(list);
        }
        notifyDataSetChanged();
    }

    /**
     * 跳转到目标 Activity
     *
     * @param cls 目标 Activity
     */
    protected void startActivity(Class<?> cls) {
        ActivityUtils.startActivity((Activity) mContext, cls);
    }

}
