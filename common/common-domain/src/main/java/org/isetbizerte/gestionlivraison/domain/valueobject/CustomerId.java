package org.isetbizerte.gestionlivraison.domain.valueobject;

import java.util.UUID;

public class CustomerId extends BaseId<UUID> {
    protected CustomerId(UUID value) {
        super(value);
    }
}
