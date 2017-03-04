package com.savethecode.factories.handled;

import com.savethecode.factories.handled.domain.MyEnum;
import com.savethecode.factories.handled.domain.MySecondType;
import com.savethecode.factories.handled.domain.MyType;
import org.springframework.stereotype.Component;

@Component
public class SecondServiceHandled implements ServiceHandled {

    @Override
    public String getMessage() {
        return "Message from second service handled";
    }

    @Override
    public boolean supports(String s) {
        return "SECOND".equals(s);
    }

    @Override
    public boolean supports(MyEnum myEnum) {
        return MyEnum.SECOND.equals(myEnum);
    }

    @Override
    public boolean supports(MyType myType) {
        return myType instanceof MySecondType;
    }
}
