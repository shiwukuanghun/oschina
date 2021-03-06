package com.itheima.baseviewpagerfragment.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.itheima.baseviewpagerfragment.R;
import com.itheima.baseviewpagerfragment.base.BaseListAdapter;
import com.itheima.baseviewpagerfragment.domain.News;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 类名:      NewsAdapter
 * 创建者:    PoplarTang
 * 创建时间:  2016/9/17.
 * 描述：     TODO
 */
public class NewsAdapter extends BaseListAdapter<News> {

    // parent即为ListView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;
        if (convertView == null) {
            // 创建ViewHolder
            holder = new ViewHolder();

            view = View.inflate(parent.getContext(), R.layout.item_list_news, null);
            holder.initViewHolder(view);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }
        News item = getItem(position);

        // 绑定ViewHolder
        holder.mIvImage.setImageResource(R.mipmap.ic_launcher);
        holder.mTvContent.setText(item.getTitle());

        return view;
    }
    static class ViewHolder {
        @BindView(R.id.iv_image)
        ImageView mIvImage;
        @BindView(R.id.tv_content)
        TextView mTvContent;

        public void initViewHolder(View view) {
            ButterKnife.bind(this, view);
            view.setTag(this);
        }
    }
}
