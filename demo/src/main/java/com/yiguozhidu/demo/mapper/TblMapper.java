package com.yiguozhidu.demo.mapper;

import com.yiguozhidu.demo.entity.Tbl;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblMapper {
    void addTbl(Tbl tbl);
    boolean removeCountryByCountry(String country);
    Tbl loadCapitalByCountry(String country);

}
