package com.geekster.urlhitcounter.service;

import com.geekster.urlhitcounter.models.HitUrlCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UrlHitService {
    List<HitUrlCounter> list=new ArrayList<>();
    int val =0;
    public List<HitUrlCounter> getAllList() {
        HitUrlCounter obj=new HitUrlCounter();
        val++;
        list.add(new  HitUrlCounter("example",val));
        return list;
    }
}
