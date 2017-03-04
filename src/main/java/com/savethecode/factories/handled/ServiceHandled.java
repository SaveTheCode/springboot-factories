package com.savethecode.factories.handled;

import com.savethecode.factories.handled.domain.MyEnum;
import com.savethecode.factories.handled.domain.MyType;

public interface ServiceHandled {

    String getMessage();

    boolean supports(String s);

    boolean supports(MyEnum myEnum);

    boolean supports(MyType myType);
}
