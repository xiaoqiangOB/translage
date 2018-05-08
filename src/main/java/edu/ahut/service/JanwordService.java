package edu.ahut.service;

import edu.ahut.entity.Janwords;
import edu.ahut.mapper.JanwordsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wengxiaofeng
 * @Description:
 * @Data create in 15:20 2018/3/8.
 * @Modified by:
 */
@Service
public class JanwordService {
    @Autowired
    private JanwordsMapper janwordsMapper;

    public List<Janwords> translate(Janwords janwords){
        List<Janwords> list = janwordsMapper.translate(janwords);
        return list;
    }

    public List<Janwords> tips(Janwords janwords){
        List<Janwords> list = janwordsMapper.tips(janwords);
        return list;
    }
}

