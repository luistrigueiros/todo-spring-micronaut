package io.quarkus.todospringquarkus;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
  
@Repository  
interface TodoRepository extends CrudRepository<TodoEntity, Long> {}
