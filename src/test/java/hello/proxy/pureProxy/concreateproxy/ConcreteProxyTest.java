package hello.proxy.pureProxy.concreateproxy;

import hello.proxy.pureProxy.concreateproxy.code.ConcreteClient;
import hello.proxy.pureProxy.concreateproxy.code.ConcreteLogic;
import hello.proxy.pureProxy.concreateproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy(){
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient concreteClient = new ConcreteClient(concreteLogic);
        concreteClient.execute();
    }

    @Test
    void addProxy(){
        ConcreteLogic concreteLogic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(concreteLogic);
        ConcreteClient concreteClient = new ConcreteClient(timeProxy);
        concreteClient.execute();
    }
}
