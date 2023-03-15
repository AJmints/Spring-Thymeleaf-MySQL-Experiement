package org.experiment.solidifyconcepts.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class User extends IdGenerator{

    /** This class works fine and POST just fine to mySQL. Not sure if there is anything
     * here that could maybe be effecting the Post class.
     */

    @Size(min = 3, max = 25, message = "Name must be between 3 and 25 characters long.")
    private String username;
    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email format.")
    private String email;
    @Size(min = 2, max = 30, message = "Password must be between 6 and 30 characters long. ")
    private String password;

    public User() {}

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
