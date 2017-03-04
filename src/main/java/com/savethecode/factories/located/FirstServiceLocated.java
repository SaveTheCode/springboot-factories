package com.savethecode.factories.located;

import org.springframework.stereotype.Component;

@Component("FIRST")
public class FirstServiceLocated implements ServiceLocated {

    @Override
    public String getMessage() {
        return "Message from first service located";
    }
}
