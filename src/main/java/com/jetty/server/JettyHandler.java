package com.jetty.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class JettyHandler extends AbstractHandler
{
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response) 
        throws IOException, ServletException
    {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        System.out.println("Request ==> "+request.getContentLength());
        //String payload = "{\"application_nm\":\"datastream\",\"customer\":\"apple\"}";
        /*
        PostToKafka post2Kafka = new PostToKafka();
        try {
			post2Kafka.write2Kafka(payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
        post2Kafka = null;
        */
        response.getWriter().println("SUCCESS");
    }
}
