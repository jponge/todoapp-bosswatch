package fr.insalyon.telecom.mid.todoapp.bosswatch;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(mappedName="jms/CompletedTodoQueue")
public class BossSpy implements MessageListener {
  
  @Inject
  private CompletedStore completedStore;

  @Override
  public void onMessage(Message message) {
    if (message instanceof TextMessage) {
      try {
        TextMessage completedTodo = (TextMessage) message;
        completedStore.add(completedTodo.getText());
      } catch (JMSException ex) {
        LOG.log(Level.SEVERE, null, ex);
      }
    } else {
      LOG.warning("Alien message: " + message);
    }
  }
  
  private static final Logger LOG = Logger.getLogger(BossSpy.class.getName());
  
}
