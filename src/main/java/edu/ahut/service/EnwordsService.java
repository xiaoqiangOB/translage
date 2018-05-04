package edu.ahut.service;

import edu.ahut.entity.Enwords;
import edu.ahut.mapper.EnwordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wengxiaofeng
 * @Description:
 * @Data create in 9:51 2018/3/4.
 * @Modified by:
 */
@Service
public class EnwordsService {
    @Autowired
    private EnwordsMapper enwordsMapper;

    public List<Enwords> translateETC(Enwords enwords){
        List<Enwords> list = enwordsMapper.translate(enwords);
        return list;
    }
}
