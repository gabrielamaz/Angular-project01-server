package org.devlogger.endpoint;

import org.devlogger.repository.LogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("logs")
public class LogsController {

  @Autowired
  private LogsRepository logsDao;

  public LogsController(LogsRepository logsDao) {
    this.logsDao = logsDao;
  }

  public ResponseEntity<?> listAllLogs() {
    return new ResponseEntity<>(logsDao.findAll(), HttpStatus.OK);
  }
}
