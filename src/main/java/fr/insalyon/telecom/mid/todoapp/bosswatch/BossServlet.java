package fr.insalyon.telecom.mid.todoapp.bosswatch;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "BossServlet", urlPatterns = {"/index.html"})
public class BossServlet extends HttpServlet {

  @Inject
  CompletedStore completedStore;
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("completed", completedStore.completed());
    getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
  }  
}
