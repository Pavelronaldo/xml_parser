package Entity;

import java.util.Objects;

public class Package {
    private float price;
    private String packageType;
    private int count;

    public Package() {
    }

    public Package(float temperature, String packageType, int count) {
        this.price = temperature;
        this.packageType = packageType;
        this.count = count;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package that = (Package) o;
        return Float.compare(that.price, price) == 0 &&
                packageType == that.packageType &&
                count == that.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, packageType, count);
    }

    @Override
    public String toString() {
        return "Package{" +
                "price=" + price +
                ", packageType=" + packageType +
                ", count=" + count +
                '}';
    }
}
