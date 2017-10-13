package com.nettyrpc.test.server;

import com.google.inject.Binder;
import com.google.inject.Module;

import static com.google.inject.name.Names.named;

/**
 * Created by admin on 2017/6/29.
 */
public class TestModule implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bindConstant().annotatedWith(named("zk.adress")).to("192.168.1.160:4180");
        binder.bindConstant().annotatedWith(named("server.adress")).to("127.0.0.1:18979");
    }
}
