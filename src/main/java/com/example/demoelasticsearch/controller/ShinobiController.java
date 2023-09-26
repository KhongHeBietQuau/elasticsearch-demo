package com.example.demoelasticsearch.controller;

import com.example.demoelasticsearch.model.ShinobiModel;
import com.example.demoelasticsearch.service.ShinobiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShinobiController {

    private ShinobiService shinobiService;
    @GetMapping("/shinobi/{id}")
    public ShinobiModel getShinobi(@PathVariable("id") String id)
    {
        return shinobiService.getShinobi(id);
    }

    @PostMapping("/shinobi")
    public List<ShinobiModel> addShinobis(@RequestBody List<ShinobiModel> list)
    {
        return shinobiService.addShinobis(list);
    }
}
