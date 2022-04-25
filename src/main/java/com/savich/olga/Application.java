package com.savich.olga;

import com.savich.olga.repository.HibernetUtils;

public class Application {
    public static void main(String... args) {
        HibernetUtils.getSessionFactory();
    }

}
//



