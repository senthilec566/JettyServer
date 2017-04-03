package com.jetty.server;

import org.eclipse.jetty.server.Server;

public class JettySinkServer {
 
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        server.setHandler(new JettyHandler());
        server.start();
        server.join();
    }
}
