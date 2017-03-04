package com.savethecode.factories.handled.factory;

import com.savethecode.MyTestType;
import com.savethecode.factories.handled.FirstServiceHandled;
import com.savethecode.factories.handled.SecondServiceHandled;
import com.savethecode.factories.handled.domain.MyEnum;
import com.savethecode.factories.handled.domain.MyFirstType;
import com.savethecode.factories.handled.domain.MySecondType;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceHandledFactoryTest {

    @Autowired
    private ServiceHandledFactory serviceHandledFactory;

    @Test
    public void getByStringSupportedFirst() {
        Assert.assertThat(
                serviceHandledFactory.get("FIRST"),
                Matchers.instanceOf(FirstServiceHandled.class));
    }

    @Test
    public void getByEnumSupportedFirst() {
        Assert.assertThat(
                serviceHandledFactory.get(MyEnum.FIRST),
                Matchers.instanceOf(FirstServiceHandled.class));
    }

    @Test
    public void getByTypeSupportedFirst() {
        Assert.assertThat(
                serviceHandledFactory.get(new MyFirstType()),
                Matchers.instanceOf(FirstServiceHandled.class));
    }

    @Test
    public void getByStringSupportedSecond() {
        Assert.assertThat(
                serviceHandledFactory.get("SECOND"),
                Matchers.instanceOf(SecondServiceHandled.class));
    }

    @Test
    public void getByEnumSupportedSecond() {
        Assert.assertThat(
                serviceHandledFactory.get(MyEnum.SECOND),
                Matchers.instanceOf(SecondServiceHandled.class));
    }

    @Test
    public void getByTypeSupportedSecond() {
        Assert.assertThat(
                serviceHandledFactory.get(new MySecondType()),
                Matchers.instanceOf(SecondServiceHandled.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getByStringUnsupported() {
        serviceHandledFactory.get("x");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getByEnumUnsupported() {
        serviceHandledFactory.get(MyEnum.THIRD);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getByTypeUnsupported() {
        serviceHandledFactory.get(new MyTestType());
    }
}
