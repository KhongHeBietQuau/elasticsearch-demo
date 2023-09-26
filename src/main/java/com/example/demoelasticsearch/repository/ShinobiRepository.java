package com.example.demoelasticsearch.repository;

import com.example.demoelasticsearch.model.ShinobiModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShinobiRepository extends ElasticsearchRepository<ShinobiModel,String> {

}
