package edu.ahut;

import com.alibaba.fastjson.JSONArray;
import edu.ahut.entity.Janwords;
import edu.ahut.service.JanwordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author wengxiaofeng
 * @Description:日翻译中
 * @Data create in 15:23 2018/3/8.
 * @Modified by:
 */
@RestController
@RequestMapping(value = "/jan")
public class JanController {
    @Autowired
    private JanwordService janwordService;

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public String translate(@RequestBody Janwords janwords){
        List<Janwords> list = janwordService.translate(janwords);
        return JSONArray.toJSONString(list);
    }

    @RequestMapping(value = "/tips",method = RequestMethod.POST)
    public String tips(@RequestBody Janwords janwords){
        List<Janwords> list = janwordService.tips(janwords);
        return JSONArray.toJSONString(list);
    }
}
