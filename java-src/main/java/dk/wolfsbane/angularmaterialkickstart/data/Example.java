package dk.wolfsbane.angularmaterialkickstart.data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/data/example.json")
public class Example extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("application/javascript");
    res.setCharacterEncoding("utf-8");
    try (Writer writer = res.getWriter()) {
      writer.write("{\"text\":\"This data is generated by the server\"}");
    }
  }
}
