package org.example.product;

import java.time.LocalDate;

public class VirtualProduct extends Product {
    private final String code;
    private final LocalDate expirationDate;

    public VirtualProduct(String name, double price, String code, LocalDate expirationDate) {
        super(name, price);
        this.code = code;
        this.expirationDate = expirationDate;
    }

    public String getCode() {
        return code;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VirtualProduct that)) return false;
        if (!super.equals(o)) return false;

        if (getCode() != null ? !getCode().equals(that.getCode()) : that.getCode() != null) return false;
        return getExpirationDate() != null ? getExpirationDate().equals(that.getExpirationDate()) : that.getExpirationDate() == null;
    }

    @Override
    public String toString() {
        return "VirtualProduct{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", code='" + code + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
