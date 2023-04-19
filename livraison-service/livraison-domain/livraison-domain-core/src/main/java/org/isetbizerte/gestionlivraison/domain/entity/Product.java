package org.isetbizerte.gestionlivraison.domain.entity;

import org.isetbizerte.gestionlivraison.domain.valueobject.Money;
import org.isetbizerte.gestionlivraison.domain.valueobject.ProductId;

public class Product extends  BaseEntity<ProductId>{

    private String name;
    private Money price;

    public Product(ProductId productId,String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

}
