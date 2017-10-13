package com.nettyrpc.test.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.nettyrpc.client.RpcClient;
import com.nettyrpc.test.client.HelloService;
import com.nettyrpc.test.client.Person;
import com.nettyrpc.test.server.TestModule;

public class ServiceTest {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TestModule());
        RpcClient rpcClient = injector.getInstance(RpcClient.class);
        HelloService helloService = rpcClient.create(HelloService.class);
        String result = helloService.hello("World");
        String oo=helloService.hello(new Person("1","2"));
        System.out.println(result);
        System.out.println(oo);
        rpcClient.stop();
    }
}
