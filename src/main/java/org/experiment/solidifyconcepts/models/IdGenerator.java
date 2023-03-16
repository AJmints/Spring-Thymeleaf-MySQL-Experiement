package org.experiment.solidifyconcepts.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class IdGenerator {

    /** Abstract class to assign all users and post with a unique ID tag **/

    @Id
    @GeneratedValue
    private int id;

    public IdGenerator() { }

    public int getId() {
        return id;
    }

}
