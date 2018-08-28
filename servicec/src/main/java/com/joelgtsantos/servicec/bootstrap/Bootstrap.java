/**
 * 
 */
package com.joelgtsantos.servicec.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.joelgtsantos.servicec.api.v1.domain.EntityC;
import com.joelgtsantos.servicec.repositories.RepositoryC;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@Component
public class Bootstrap implements CommandLineRunner {

    private final RepositoryC repository;

    public Bootstrap(RepositoryC repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        EntityC entityC1 = new EntityC();
        entityC1.setName("object 1 entity C");

        EntityC entityC2 = new EntityC();
        entityC2.setName("object 2 entity C");
        
        EntityC entityC3 = new EntityC();
        entityC3.setName("object 3 entity C");

        repository.save(entityC1);
        repository.save(entityC2);
        repository.save(entityC3);

        System.out.println("Categories Loaded: " + repository.count());
    }
}
