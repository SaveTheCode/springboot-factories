package com.savethecode.factories.handled.factory;

import com.savethecode.factories.handled.ServiceHandled;
import com.savethecode.factories.handled.domain.MyEnum;
import com.savethecode.factories.handled.domain.MyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceHandledFactory {

    private final List<ServiceHandled> serviceHandledList;

    @Autowired
    public ServiceHandledFactory(List<ServiceHandled> serviceHandledList) {
        this.serviceHandledList = serviceHandledList;
    }

    public ServiceHandled get(String s) {

        return serviceHandledList
                .stream()
                .filter(serviceHandled -> serviceHandled.supports(s))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public ServiceHandled get(MyEnum myEnum) {

        return serviceHandledList
                .stream()
                .filter(serviceHandled -> serviceHandled.supports(myEnum))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public ServiceHandled get(MyType myType) {

        return serviceHandledList
                .stream()
                .filter(serviceHandled -> serviceHandled.supports(myType))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
