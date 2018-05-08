package edu.ahut.service;

import com.alibaba.fastjson.JSONArray;
import edu.ahut.entity.Cnwords;
import edu.ahut.mapper.CnwordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wengxiaofeng
 * @Description:
 * @Data create in 12:36 2018/3/8.
 * @Modified by:
 */
@Service
public class CnwordService {
    @Autowired
    private CnwordsMapper cnwordsMapper;

    public List<Cnwords> translate(Cnwords cnwords){
        List<Cnwords> list = cnwordsMapper.translate(cnwords);
        return list;
    }

    public List<Cnwords> tips(Cnwords cnwords){
        List<Cnwords> list = cnwordsMapper.tips(cnwords);
        return list;
    }
}
