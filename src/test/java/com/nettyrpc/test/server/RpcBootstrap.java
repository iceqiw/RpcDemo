package com.nettyrpc.test.server;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.nettyrpc.server.RpcServer;

public class RpcBootstrap {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new TestModule());
        RpcServer rpcServer = injector.getInstance(RpcServer.class);
        try {
            rpcServer.start("com.nettyrpc.test.server");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
