package com.example.BirdApp.controller;

import java.util.List;

import com.example.BirdApp.model.Bird_ps;
import com.example.BirdApp.repository.IBirdRepository_ps;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by araam on 9/14/17.
 * // http://localhost:9001/api/ps/birds
 */
@RestController
@CrossOrigin
@RequestMapping("ps/")
public class BirdController_ps {
    @Autowired
    private IBirdRepository_ps iBirdRepository_ps;

    @RequestMapping(value = "birds", method = RequestMethod.GET)
    public List<Bird_ps> list() {
        System.out.println(">>>>>>>>>>>>> in BirdController_ps, get /birds");
        System.out.println(iBirdRepository_ps.findAll());
        return iBirdRepository_ps.findAll();
    }


//    @RequestMapping(
//            value = "birds",
//            headers = { "key1=val1", "key2=val2" }, method = RequestMethod.GET)
//    @ResponseBody
//    public List<Bird_ps> getBirdsWithQueryParameters() {
//        return iBirdRepository_ps.findAndfilterByRegion();
//    }

    @RequestMapping(value = "birds", method = RequestMethod.POST)
    public Bird_ps create(@RequestBody Bird_ps bird_ps) {
        return iBirdRepository_ps.saveAndFlush(bird_ps);
    }

    @RequestMapping(value = "birds/{id}", method = RequestMethod.GET)
    public Bird_ps get(@PathVariable Integer id) {
        return iBirdRepository_ps.findOne(id);
    }

    @RequestMapping(value = "birds/{id}", method = RequestMethod.PUT)
    public Bird_ps update(@PathVariable Integer id, @RequestBody Bird_ps bird_ps) {
        Bird_ps existingBird_ps = iBirdRepository_ps.findOne(id);
        BeanUtils.copyProperties(bird_ps, existingBird_ps);
        return iBirdRepository_ps.saveAndFlush(existingBird_ps);
    }

    @RequestMapping(value = "birds/{id}", method = RequestMethod.DELETE)
    public Bird_ps delete(@PathVariable Integer id) {
        Bird_ps existingBird_ps = iBirdRepository_ps.findOne(id);
        iBirdRepository_ps.delete(existingBird_ps);
        return existingBird_ps;
    }

}
