package com.yiguozhidu.demo.mapper;

import com.yiguozhidu.demo.entity.Tbl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TblMapper {
    boolean insert(@Param("country") String country,@Param("capital") String capital);
    boolean removeCountryByCountry(String country);
    Tbl loadCapitalByCountry(String country);
    List<Tbl> getAll();
    boolean update(Tbl tbl);
    boolean update0(@Param("country") String country,@Param("capital") String capital);
    Tbl getAllById(int cid);
}
