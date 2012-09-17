package fr.insalyon.telecom.mid.todoapp.bosswatch;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class CompletedStore {
  
  private final List<String> completed = new LinkedList<String>();
  
  public synchronized void add(String todo) {
    completed.add(todo);
  }
  
  public List<String> completed() {
    return Collections.unmodifiableList(completed);
  }
}
