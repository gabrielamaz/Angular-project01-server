package org.devlogger.repository;

import org.devlogger.model.Logs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsRepository extends CrudRepository<Logs, Long> {
  
}
