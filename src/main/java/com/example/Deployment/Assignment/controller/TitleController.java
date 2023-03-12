package com.example.Deployment.Assignment.controller;

import com.example.Deployment.Assignment.model.Title;
import com.example.Deployment.Assignment.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/test")
public class TitleController {
    @Autowired
    TitleService titleService;
    @PostMapping(value = "create-title")
    public Title createTitle(@RequestBody Title title){
        return titleService.createTitle(title);
    }
    @GetMapping(value = "get-title")
    public List<Title> getTitles(){
        return titleService.getTitle();
    }
    @GetMapping(value = "get-title/{id}")
    public Title getTitleById(@PathVariable int id){
        return titleService.getTitleById(id);
    }
    @PutMapping(value = "update-title/{id}")
    public void updateTitle(@PathVariable int id, @RequestBody Title title){
        titleService.updateTitle(id, title);
    }
    @DeleteMapping(value = "delete-title/{id}")
    public void deleteById(@PathVariable int id){
        titleService.deleteTitle(id);
    }
}
