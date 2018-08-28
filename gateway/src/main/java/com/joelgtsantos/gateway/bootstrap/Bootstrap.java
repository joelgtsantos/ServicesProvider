/**
 * 
 */
package com.joelgtsantos.gateway.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.joelgtsantos.gateway.api.v1.domain.EntityA;
import com.joelgtsantos.gateway.repositories.RepositoryA;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@Component
public class Bootstrap implements CommandLineRunner {

    private final RepositoryA repositoryA;

    public Bootstrap(RepositoryA repositoryA) {
        this.repositoryA = repositoryA;
    }

    @Override
    public void run(String... args) throws Exception {
        EntityA entityA1 = new EntityA();
        entityA1.setName("object 1");

        EntityA entityA2 = new EntityA();
        entityA2.setName("object 2");
        
        EntityA entityA3 = new EntityA();
        entityA3.setName("object 3");

        repositoryA.save(entityA1);
        repositoryA.save(entityA2);
        repositoryA.save(entityA3);

        System.out.println("Categories Loaded: " + repositoryA.count());
    }
}
