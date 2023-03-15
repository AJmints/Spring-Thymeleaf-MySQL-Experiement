package org.experiment.solidifyconcepts.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public abstract class IdPostGenerator {

    /** This was a test to see if maybe a different ID generator class just for Post would fix the issue.
     * It did not, but keeping this around until the issue is resolved.
     */

    @Id
    @GeneratedValue
    private int id;

    public IdPostGenerator() { }

    public int getId() {
        return id;
    }
}
