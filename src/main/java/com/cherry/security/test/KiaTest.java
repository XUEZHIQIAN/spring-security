package com.cherry.security.test;

import com.cherry.security.model.People;
import org.junit.Test;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test
 *
 * @author Hang W
 */
public class KiaTest {

    @Autowired
    private KieSession kieSession;

    @Test
    public void main() {

        People people = new People();
        people.setName("Hang");
        people.setSex(1);
        people.setDrlType("people");
        kieSession.insert(people);//插入
        kieSession.fireAllRules();//执行规则
        kieSession.dispose();//释放资源
    }

}
