package org.isetbizerte.gestionlivraison.domain.entity;


import org.isetbizerte.gestionlivraison.domain.valueobject.DeliveryId;
import org.isetbizerte.gestionlivraison.domain.valueobject.DeliveryItemId;
import org.isetbizerte.gestionlivraison.domain.valueobject.Money;

public class DeliveryItem extends BaseEntity<DeliveryItemId> {

    private DeliveryId deliveryId;
    private  final Product product;
    private final int quantity;
    private final Money price;
    private final Money subTotal;

    private DeliveryItem(Builder builder) {
        super.setId(builder.deliveryItemId);
        deliveryId = builder.deliveryId;
        product = builder.product;
        quantity = builder.quantity;
        price = builder.price;
        subTotal = builder.subTotal;
    }


    public DeliveryId getDeliveryId() {
        return deliveryId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public Money getSubTotal() {
        return subTotal;
    }

    public static final class Builder {
        private DeliveryItemId deliveryItemId;
        private DeliveryId deliveryId;
        private final Product product;
        private final int quantity;
        private final Money price;
        private final Money subTotal;

        public Builder(Product product, int quantity, Money price, Money subTotal) {
            this.product = product;
            this.quantity = quantity;
            this.price = price;
            this.subTotal = subTotal;
        }

        public Builder deliveryItemId(DeliveryItemId val) {
            deliveryItemId = val;
            return this;
        }

        public Builder deliveryId(DeliveryId val) {
            deliveryId = val;
            return this;
        }

        public DeliveryItem build() {
            return new DeliveryItem(this);
        }
    }
}
