package com.geekster.urlhitcounter.controller;

import com.geekster.urlhitcounter.models.HitUrlCounter;
import com.geekster.urlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
private UrlHitService urlHitService;
    @GetMapping("count")
    public List<HitUrlCounter> getAll() {

        List<HitUrlCounter> list = urlHitService.getAllList();
        return list;
    }
}
