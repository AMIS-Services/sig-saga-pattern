package nl.amis.ecommerce.events;

import nl.amis.ecommerce.status.OrderStatus;

import java.math.BigDecimal;

public class OrderCreatedEvent {

    public final String orderId;

    public final String itemType;

    public final BigDecimal price;

    public final String currency;

    public final OrderStatus orderStatus;

    public OrderCreatedEvent(String orderId, String itemType, BigDecimal price, String currency, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.itemType = itemType;
        this.price = price;
        this.currency = currency;
        this.orderStatus = orderStatus;
    }
}
