package org.experiment.solidifyconcepts.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class Post extends IdGenerator{

    /** This is the problem child! From what I can tell, everything is set up properly in here.
     * In resources/templates/feed/feed.html is where you can view the html.
     * **/

    @Size(min = 3, max = 25, message = "Name must be between 3 and 25 characters long.")
    private String posterName;
    @Size(min = 1, max = 500, message = "Message can only contain up to 500 characters.")
    private String post;

    public Post(String posterName, String post) {
        this.posterName = posterName;
        this.post = post;
    }

    public Post() {
    }

    public String getPosterName() {
        return posterName;
    }
    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }


    @Override
    public String toString() {
        return posterName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return this.getId() == post.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }
}
