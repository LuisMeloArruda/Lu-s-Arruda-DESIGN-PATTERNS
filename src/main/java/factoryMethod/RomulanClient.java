package factoryMethod;

import strategy.ImpatientStrategy;
import strategy.OrderingStrategy;

public class RomulanClient extends AlienClient{
    public OrderingStrategy createOrderingStrategy() {
        OrderingStrategy Impatient = new ImpatientStrategy();
        return Impatient;
    }
}
