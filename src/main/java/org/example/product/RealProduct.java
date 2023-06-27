package org.example.product;

public class RealProduct extends Product {
    private final int size;
    private final int weight;

    public RealProduct(String name, double price, int size, int weight) {
        super(name, price);
        this.size = size;
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealProduct that)) return false;
        if (!super.equals(o)) return false;

        if (getSize() != that.getSize()) return false;
        return getWeight() == that.getWeight();
    }

    @Override
    public String toString() {
        return "RealProduct{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
