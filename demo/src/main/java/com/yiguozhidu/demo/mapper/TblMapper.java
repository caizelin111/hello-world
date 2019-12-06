package com.yiguozhidu.demo.mapper;

import com.yiguozhidu.demo.entity.Tbl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TblMapper {
    void addTbl(Tbl tbl);
    boolean removeCountryByCountry(String country);
    Tbl loadCapitalByCountry(String country);
    List<Tbl> getAll();
}
