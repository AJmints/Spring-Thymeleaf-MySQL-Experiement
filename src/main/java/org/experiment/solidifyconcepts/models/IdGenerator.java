package org.experiment.solidifyconcepts.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
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
