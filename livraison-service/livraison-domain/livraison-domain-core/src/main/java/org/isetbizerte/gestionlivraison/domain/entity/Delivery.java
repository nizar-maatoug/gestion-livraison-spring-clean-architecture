package org.isetbizerte.gestionlivraison.domain.entity;

import org.isetbizerte.gestionlivraison.domain.valueobject.*;

import java.util.List;

public class Delivery extends AggregateRoot<DeliveryId>{

    private final CustomerId customerId;
    private final DriverId driverId;
    private final Address deliveryAddress;
    private final Money price;
    private final List<DeliveryItem> items;

    private TrackingId trackingId;
    private DeliveryStatus deliveryStatus;
    private List<String> failureMessages;

    private Delivery(Builder builder) {
        super.setId(builder.deliveryId);
        customerId = builder.customerId;
        driverId = builder.driverId;
        deliveryAddress = builder.deliveryAddress;
        price = builder.price;
        items = builder.items;
        trackingId = builder.trackingId;
        deliveryStatus = builder.deliveryStatus;
        failureMessages = builder.failureMessages;
    }


    public CustomerId getCustomerId() {
        return customerId;
    }

    public DriverId getDriverId() {
        return driverId;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Money getPrice() {
        return price;
    }

    public List<DeliveryItem> getItems() {
        return items;
    }

    public TrackingId getTrackingId() {
        return trackingId;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public List<String> getFailureMessages() {
        return failureMessages;
    }


    public static final class Builder {
        private DeliveryId deliveryId;
        private final CustomerId customerId;
        private final DriverId driverId;
        private final Address deliveryAddress;
        private final Money price;
        private final List<DeliveryItem> items;
        private TrackingId trackingId;
        private DeliveryStatus deliveryStatus;
        private List<String> failureMessages;

        public Builder(CustomerId customerId, DriverId driverId, Address deliveryAddress, Money price, List<DeliveryItem> items) {
            this.customerId = customerId;
            this.driverId = driverId;
            this.deliveryAddress = deliveryAddress;
            this.price = price;
            this.items = items;
        }

        public Builder id(DeliveryId val) {
            deliveryId = val;
            return this;
        }

        public Builder trackingId(TrackingId val) {
            trackingId = val;
            return this;
        }

        public Builder deliveryStatus(DeliveryStatus val) {
            deliveryStatus = val;
            return this;
        }

        public Builder failureMessages(List<String> val) {
            failureMessages = val;
            return this;
        }

        public Delivery build() {
            return new Delivery(this);
        }
    }
}
