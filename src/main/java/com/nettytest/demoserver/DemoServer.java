package com.nettytest.demoserver;

import com.nettytest.domain.ExpRequest;
import com.nettytest.interceptor.ExpRequestHandler;
import com.nettytest.interceptor.FibRequestHandler;

public class DemoServer {

    public static void main(String[] args) {
        RPCServer server = new RPCServer("localhost", 8888, 2, 16);
        server.service("fib", Integer.class, new FibRequestHandler())
                .service("exp", ExpRequest.class, new ExpRequestHandler());
        server.start();
    }

}