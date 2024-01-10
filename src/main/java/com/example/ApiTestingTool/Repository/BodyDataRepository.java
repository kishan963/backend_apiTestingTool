package com.example.ApiTestingTool.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.ApiTestingTool.Models.ApiBody;

public interface BodyDataRepository extends MongoRepository<ApiBody,Integer> {
    
}
