package com.itheima.baseviewpagerfragment.viewpager;

import com.itheima.baseviewpagerfragment.adapter.BasicPagerAdapter;
import com.itheima.baseviewpagerfragment.base.BaseViewPagerFragment;
import com.itheima.baseviewpagerfragment.fragment.BlogListFragment;
import com.itheima.baseviewpagerfragment.fragment.DefaultFragment;
import com.itheima.baseviewpagerfragment.fragment.NewsListFragment;

/**
 * 类名:      NewsVPFragment
 * 创建者:    PoplarTang
 * 创建时间:  2016/9/17.
 * 描述：     TODO
 */
public class NewsVPFragment extends BaseViewPagerFragment {
    @Override
    protected void setupAdapter(BasicPagerAdapter adapter) {
        adapter.addTab("资讯", NewsListFragment.class, getBundle("咨讯的参数"));
        adapter.addTab("热点", DefaultFragment.class, getBundle("热点的参数"));
        adapter.addTab("博客", BlogListFragment.class, getBundle("博客的参数"));
        adapter.addTab("推荐", DefaultFragment.class, getBundle("推荐的参数"));
    }
}
