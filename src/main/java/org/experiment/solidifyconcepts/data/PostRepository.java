package org.experiment.solidifyconcepts.data;

import org.experiment.solidifyconcepts.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
