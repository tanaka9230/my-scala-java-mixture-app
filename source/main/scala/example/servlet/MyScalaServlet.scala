package example

import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(Array("/helloalice"))
class ExampleServlet extends HttpServlet {
  val bob = new BobS(null)
  val alice = new AliceJ(bob)

  bob.setAlice(alice);

  protected override def doGet(request: HttpServletRequest, response: HttpServletResponse): Unit = {
    response.setCharacterEncoding("UTF-8")
    response.getWriter().print(bob.name);
  }
}
