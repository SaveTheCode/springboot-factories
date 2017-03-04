package com.savethecode.factories.located;

import org.springframework.stereotype.Component;

@Component("SECOND")
public class SecondServiceLocated implements ServiceLocated {

    @Override
    public String getMessage() {
        return "Message from second service located";
    }
}
