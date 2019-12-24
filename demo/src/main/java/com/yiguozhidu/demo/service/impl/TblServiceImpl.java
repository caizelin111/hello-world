package com.yiguozhidu.demo.service.impl;

import com.yiguozhidu.demo.entity.Tbl;
import com.yiguozhidu.demo.mapper.TblMapper;
import com.yiguozhidu.demo.service.TblService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TblServiceImpl implements TblService {
    @Resource
    private TblMapper tblMapper;
    @Override
    public boolean insert(@Param("country") String country,@Param("capital") String capital){
        if(tblMapper.insert(country,capital))
            return true;
        return false;

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
    @Override
    public  boolean update(Tbl tbl){
       if(tblMapper.update(tbl))
        return true;
        return false;
    }
    @Override
    public boolean update0(@Param("country") String country,@Param("capital") String capital){
        if(tblMapper.update0(country,capital))
            return true;
        return false;
    }
    @Override
    public Tbl  getAllById(int cid){
        Tbl tbl=new Tbl();
        tbl=tblMapper.getAllById(cid);
        return tbl;
    }
}
