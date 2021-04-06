package com.rust.Service;

import com.rust.Dao.Mapper.AppealMapper;
import com.rust.Item.Appeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppealService{
    @Autowired
    private AppealMapper appealMapper;
    public int insertAppeal(Appeal appeal) {
        appealMapper.insterAppeal(appeal);
        return 0;
    }
}
