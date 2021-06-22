package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/fetch")
public class FetchServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println(" ");
    response.getWriter().println("CUNY Tutor Corps - Tutor         (February 2021- present)");
    response.getWriter().println("Assist 20 High School students with Trigonometry, Earth Science or Computer Science lessons.");
    response.getWriter().println("Collaborate with teachers to structure lesson plans; provide support to students who require additional assistance.");
    response.getWriter().println("Build rapport and consistency with students.");
    response.getWriter().println(" ");
    response.getWriter().println("Morgan Stanley - Technology Intern          (January 2021)");
    response.getWriter().println("Collaborated with team members at Morgan Stanley to execute a three-week project that required us to build an application using Agile to store incoming feeds to database.");
    response.getWriter().println("Worked with the data warehouse team to create a single view webpage which helped mapping the data outcome.");
    response.getWriter().println("Got familiar with excel and used it to store incoming data.");



  }
}