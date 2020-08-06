package com.svw.baserecyclerviewadapterhelper;

import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.svw.baserecyclerviewadapterhelper.adapter.MultipleItemQuickAdapter;
import com.svw.baserecyclerviewadapterhelper.base.BaseActivity;
import com.svw.baserecyclerviewadapterhelper.data.DataServer;
import com.svw.baserecyclerviewadapterhelper.entity.MultipleItem;
import com.svw.library.adapter.base.BaseQuickAdapter;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 * modify by AllenCoder
 */
public class MultipleItemUseActivity extends BaseActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_item_use);
        setTitle("MultipleItem Use");
        setBackBtn();
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
        final List<MultipleItem> data = DataServer.getMultipleItemData();
        final MultipleItemQuickAdapter multipleItemAdapter = new MultipleItemQuickAdapter(this, data);
        final GridLayoutManager manager = new GridLayoutManager(this, 4);
        mRecyclerView.setLayoutManager(manager);
        multipleItemAdapter.setSpanSizeLookup(new BaseQuickAdapter.SpanSizeLookup() {
            @Override
            public int getSpanSize(GridLayoutManager gridLayoutManager, int position) {
                return data.get(position).getSpanSize();
            }
        });
        mRecyclerView.setAdapter(multipleItemAdapter);
    }


}
