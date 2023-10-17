package com.example.springelasticsearchdeneme05.repository;

import java.util.List;

import com.example.springelasticsearchdeneme05.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticSearchRepository extends ElasticsearchRepository<Employee, String>{

    public List<Employee> findByEmployeeId(String employeeId);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"department\": \"?0\"}}]}}")
    public Page<Employee> findEmployeesByDepartment(String department, Pageable pageable);

}