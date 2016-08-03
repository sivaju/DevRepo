package com.iicind.data.repository;

import com.iicind.data.model.ResarvationEvent;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shivakrishna on 02/08/16.
 */
public interface ResarvationRepositpry extends CrudRepository<ResarvationEvent,Integer>{

    public void add();

}
