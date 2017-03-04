package com.savethecode.factories.located.factory;

import com.savethecode.factories.located.FirstServiceLocated;
import com.savethecode.factories.located.SecondServiceLocated;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceLocatedFactoryTest {

    @Autowired
    private ServiceLocatedFactory serviceLocatedFactory;

    @Test
    public void getSupportedFirst() {
        Assert.assertThat(
                serviceLocatedFactory.get("FIRST"),
                Matchers.instanceOf(FirstServiceLocated.class));
    }

    @Test
    public void getSupportedSecond() {
        Assert.assertThat(
                serviceLocatedFactory.get("SECOND"),
                Matchers.instanceOf(SecondServiceLocated.class));
    }

    @Test(expected = NoSuchBeanDefinitionException.class)
    public void getUnsupported() {
        serviceLocatedFactory.get("x");
    }
}
