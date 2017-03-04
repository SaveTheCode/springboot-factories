package com.savethecode.factories.located.factory;


import com.savethecode.factories.located.ServiceLocated;

public interface ServiceLocatedFactory {

    ServiceLocated get(String name);
}
