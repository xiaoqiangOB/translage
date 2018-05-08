package edu.ahut;

import com.alibaba.fastjson.JSONArray;
import edu.ahut.entity.Cnwords;
import edu.ahut.service.CnwordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wengxiaofeng
 * @Description:汉译英contorller
 * @Data create in 12:35 2018/3/8.
 * @Modified by:
 */
@RestController
@RequestMapping(value = "/chn")
public class CNTENController {
    @Autowired
    private CnwordService cnwordService;

    @RequestMapping(value="/search",method = RequestMethod.POST)
    public String translate(@RequestBody Cnwords cnwords){
        return JSONArray.toJSONString(cnwordService.translate(cnwords));
    }

    /**
     * @
     * @param cnwords
     * @return
     */
    @RequestMapping(value = "/tips",method = RequestMethod.POST)
    public String tip(@RequestBody Cnwords cnwords){
        return JSONArray.toJSONString(cnwordService.tips(cnwords));
    }
}
