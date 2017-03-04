package com.savethecode.factories.handled;

import com.savethecode.factories.handled.domain.MyEnum;
import com.savethecode.factories.handled.domain.MyFirstType;
import com.savethecode.factories.handled.domain.MyType;
import org.springframework.stereotype.Component;

@Component
public class FirstServiceHandled implements ServiceHandled {

    @Override
    public String getMessage() {
        return "Message from first service handled";
    }

    @Override
    public boolean supports(String s) {
        return "FIRST".equals(s);
    }

    @Override
    public boolean supports(MyEnum myEnum) {
        return MyEnum.FIRST.equals(myEnum);
    }

    @Override
    public boolean supports(MyType myType) {
        return myType instanceof MyFirstType;
    }
}
