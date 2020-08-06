package com.svw.baserecyclerviewadapterhelper.adapter;

import com.svw.baserecyclerviewadapterhelper.R;
import com.svw.baserecyclerviewadapterhelper.entity.HomeItem;
import com.svw.library.adapter.base.BaseQuickAdapter;
import com.svw.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class HomeAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {
    public HomeAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem item) {
        helper.setText(R.id.text, item.getTitle());
        helper.setImageResource(R.id.icon, item.getImageResource());
    }
}
