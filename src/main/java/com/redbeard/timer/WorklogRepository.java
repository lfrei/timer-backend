package com.redbeard.timer;

import com.redbeard.timer.domain.Worklog;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WorklogRepository extends CrudRepository<Worklog, Long> {

    List<Worklog> findByUser(String user);
}
