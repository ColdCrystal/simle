package com.itheima.service.impl;

import com.itheima.dao.itemDao;
import com.itheima.domain.items;
import com.itheima.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

;

@Service
@Transactional
public class itemServiceImpl implements itemService {

    @Autowired
    private itemDao ItemDao;
    public items findById(Integer id) {
        items items = ItemDao.findById(1);
        return items;
    }
}
