package org.devlogger.endpoint;

import org.devlogger.model.Logs;
import org.devlogger.repository.LogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("logs")
public class LogsController {

  @Autowired
  private LogsRepository logsDao;

  public LogsController(LogsRepository logsDao) {
    this.logsDao = logsDao;
  }

  @GetMapping
  public ResponseEntity<?> listAllLogs() {
    return new ResponseEntity<>(logsDao.findAll(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<?> saveLog(@Valid @RequestBody Logs log) {
    return new ResponseEntity<>(logsDao.save(log), HttpStatus.OK);
  }
}
