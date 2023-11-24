package factoryMethod;

import strategy.OrderingStrategy;
import strategy.SmartStrategy;

public class FerengiClient extends AlienClient {
    public OrderingStrategy createOrderingStrategy() {
        OrderingStrategy smart = new SmartStrategy();
        return smart;
    }
}
