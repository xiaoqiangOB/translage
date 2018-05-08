package edu.ahut;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import edu.ahut.entity.Enwords;
import edu.ahut.service.EnwordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author wengxiaofeng
 * @Description:英译汉controller
 * @Data create in 15:00 2018/3/2.
 * @Modified by:
 */
@RestController
@RequestMapping(value = "/eng")
public class MainController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private EnwordsService enwordsService;

    //@ResponseBody
    @RequestMapping(value="/ETC",method = RequestMethod.POST)
    String queryFromEnglishToChinese(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("select *from enwords where word like 'abandon%'");
        return JSONArray.toJSONString(list);
    }
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    String test(@RequestBody Enwords enwords){
        List<Enwords> list = enwordsService.translateETC(enwords);
        return JSONArray.toJSONString(list);
    }

    @RequestMapping(value = "/tips",method = RequestMethod.POST)
    String queryById(@RequestBody Enwords enwords){
        List<Enwords> result = enwordsService.tips(enwords);
        return JSONArray.toJSONString(result);
    }
}
