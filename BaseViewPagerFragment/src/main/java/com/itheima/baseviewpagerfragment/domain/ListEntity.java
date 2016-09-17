package com.itheima.baseviewpagerfragment.domain;

import java.io.Serializable;
import java.util.List;

public interface ListEntity<T extends Entity> extends Serializable {

    public List<T> getList();
}
