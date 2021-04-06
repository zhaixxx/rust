package com.rust.Dao.Mapper;

import com.rust.Item.Appeal;

import java.util.ArrayList;

public interface AppealMapper {
    int insterAppeal(Appeal appeal);
    int deleteAppeal();
    ArrayList<Appeal> selectAllAppeal();
    Appeal selectAppealById();
}
