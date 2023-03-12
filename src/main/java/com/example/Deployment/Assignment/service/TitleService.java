package com.example.Deployment.Assignment.service;

import com.example.Deployment.Assignment.model.Title;
import com.example.Deployment.Assignment.repository.TitleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {

    @Autowired
    TitleRepo titleRepo;


    public Title createTitle(Title title) {
        return titleRepo.save(title);
    }

    public List<Title> getTitle() {
        return titleRepo.findAll();
    }

    public Title getTitleById(int id) {
        return titleRepo.findById(id).get();
    }

    public void updateTitle(int id, Title newTitle) {
        Title title = titleRepo.findById(id).get();
        title.setTitle(newTitle.getTitle());
        title.setDescription(newTitle.getDescription());
        titleRepo.save(title);
    }

    public void deleteTitle(int id) {
        titleRepo.deleteById(id);
    }
}
