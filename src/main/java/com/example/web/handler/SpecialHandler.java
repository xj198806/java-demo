package com.example.web.handler;

import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dwb on 2017/6/14.
 */
public class SpecialHandler implements HttpRequestHandler{


    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.setHeader("ss","ss");
        httpServletResponse.setContentType("application/json");
        // Get the printwriter object from response to write the required json object to the output stream
        PrintWriter out = httpServletResponse.getWriter();
        // Assuming your json object is **jsonObject**, perform the following, it will return your json object
        out.print("{\"success\":true}");
        out.flush();
    }
}
