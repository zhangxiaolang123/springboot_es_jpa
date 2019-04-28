package com.zxl.dao;

import com.zxl.entity.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * Created by zxl on 2019/4/28.
 */
@Component
public interface EmployeeRepository extends ElasticsearchRepository<Employee,String> {
 
    /**
     * 查询雇员信息
     * @param id
     * @return
     */
    Employee queryEmployeeById(String id);
}
