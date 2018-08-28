/**
 * 
 */
package com.joelgtsantos.serviceb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.joelgtsantos.serviceb.api.v1.domain.EntityB;
import com.joelgtsantos.serviceb.repositories.RepositoryB;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@Component
public class Bootstrap implements CommandLineRunner {

    private final RepositoryB repository;

    public Bootstrap(RepositoryB repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        EntityB entityB1 = new EntityB();
        entityB1.setName("object 1 entity B");

        EntityB entityB2 = new EntityB();
        entityB2.setName("object 2 entity B");
        
        EntityB entityB3 = new EntityB();
        entityB3.setName("object 3 entity B");

        repository.save(entityB1);
        repository.save(entityB2);
        repository.save(entityB3);

        System.out.println("Categories Loaded: " + repository.count());
    }
}
