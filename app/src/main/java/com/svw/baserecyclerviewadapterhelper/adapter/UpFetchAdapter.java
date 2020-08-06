package com.svw.baserecyclerviewadapterhelper.adapter;

import com.svw.baserecyclerviewadapterhelper.R;
import com.svw.baserecyclerviewadapterhelper.base.BaseDataBindingAdapter;
import com.svw.baserecyclerviewadapterhelper.databinding.ItemMovieBinding;
import com.svw.baserecyclerviewadapterhelper.entity.Movie;

/**
 * Created by tysheng
 * Date: 2017/5/25 10:47.
 * Email: tyshengsx@gmail.com
 */

public class UpFetchAdapter extends BaseDataBindingAdapter<Movie, ItemMovieBinding> {
    public UpFetchAdapter() {
        super(R.layout.item_movie, null);
    }

    @Override
    protected void convert(ItemMovieBinding binding, Movie item) {
        binding.setMovie(item);
    }
}
