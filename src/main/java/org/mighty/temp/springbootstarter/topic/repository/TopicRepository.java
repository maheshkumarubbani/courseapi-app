package org.mighty.temp.springbootstarter.topic.repository;

import org.mighty.temp.springbootstarter.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
