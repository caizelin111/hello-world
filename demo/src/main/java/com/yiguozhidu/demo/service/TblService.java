package com.yiguozhidu.demo.service;

import com.yiguozhidu.demo.entity.Tbl;

public interface TblService {
    void addTbl(Tbl tbl);
    boolean removeCountryByCountry(String country);
    Tbl loadCapitalByCountry(String country);
}
