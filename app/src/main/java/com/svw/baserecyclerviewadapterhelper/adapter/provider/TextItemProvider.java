package com.svw.baserecyclerviewadapterhelper.adapter.provider;

import android.widget.Toast;

import com.svw.baserecyclerviewadapterhelper.R;
import com.svw.baserecyclerviewadapterhelper.adapter.DemoMultipleItemRvAdapter;
import com.svw.baserecyclerviewadapterhelper.entity.NormalMultipleEntity;
import com.svw.library.adapter.base.BaseViewHolder;
import com.svw.library.adapter.base.provider.BaseItemProvider;

/**
 * https://github.com/chaychan
 *
 * @author ChayChan
 * @description: Text ItemProvider
 * @date 2018/3/30  11:39
 */

public class TextItemProvider extends BaseItemProvider<NormalMultipleEntity, BaseViewHolder> {

    @Override
    public int viewType() {
        return DemoMultipleItemRvAdapter.TYPE_TEXT;
    }

    @Override
    public int layout() {
        return R.layout.item_text_view;
    }

    @Override
    public void convert(BaseViewHolder helper, NormalMultipleEntity data, int position) {
        helper.setText(R.id.tv, data.content);
    }

    @Override
    public void onClick(BaseViewHolder helper, NormalMultipleEntity data, int position) {
        Toast.makeText(mContext, "click", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(BaseViewHolder helper, NormalMultipleEntity data, int position) {
        Toast.makeText(mContext, "longClick", Toast.LENGTH_SHORT).show();
        return true;
    }
}
