package com.example.demoelasticsearch.service;

import com.example.demoelasticsearch.model.ShinobiModel;
import com.example.demoelasticsearch.repository.ShinobiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShinobiService {

    private ShinobiRepository shinobiRepository;
    public ShinobiModel getShinobi(String id)
    {
        return shinobiRepository.findById(id).orElse(null);
    }

    public List<ShinobiModel> addShinobis(List<ShinobiModel> list){
        return (List<ShinobiModel>) shinobiRepository.saveAll(list);
    }
}
