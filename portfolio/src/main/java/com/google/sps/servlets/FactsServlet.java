package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/randomFunFacts")
public class FactsServlet extends HttpServlet {

  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {

      final ArrayList<String> randomFunFacts = new ArrayList<String>();
      randomFunFacts.add("Cotton candy was invented by a dentist.");
      randomFunFacts.add("Chewing gum boosts concentration.");
      randomFunFacts.add("The first computer was invented in the 1940s.");
  }


    /**
     * Converts a ServerStats instance into a JSON string using the Gson library.
     */
/** 
  private String convertToJsonUsingGson(final ArrayList<String> list) {
    final Gson gson = new Gson();
    final String json = gson.toJson(list);
    return json;
  }
}*/