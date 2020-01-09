package org.devlogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity @Data @NoArgsConstructor
public class Logs {
  @Id
  private long id;

  @NotEmpty
  private String text;

  @DateTimeFormat @NotEmpty
  private Date date;
}
