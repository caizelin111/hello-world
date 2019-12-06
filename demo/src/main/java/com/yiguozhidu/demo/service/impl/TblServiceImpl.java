package com.yiguozhidu.demo.service.impl;

import com.yiguozhidu.demo.entity.Tbl;
import com.yiguozhidu.demo.mapper.TblMapper;
import com.yiguozhidu.demo.service.TblService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TblServiceImpl implements TblService {
    @Resource
    private TblMapper tblMapper;
    @Override
    public void addTbl(Tbl tbl) {
        tblMapper.addTbl(tbl);

    }

    @Override
    public boolean removeCountryByCountry(String country) {
        tblMapper.removeCountryByCountry(country);
        return true;
    }

    @Override

    public Tbl loadCapitalByCountry(String country) {
        Tbl tbl = new Tbl();
        tbl = null;
        tbl = tblMapper.loadCapitalByCountry(country);
        return tbl;
    }
    @Override
    public List<Tbl> getAll(){

        List<Tbl> list=tblMapper.getAll();
        return list;


    }
}
