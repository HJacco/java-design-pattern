package pattern.create.factory.sample;

public class SampleFactory {
    public static BaseProduct createProduct(String type) {
        if("A".equals(type)) {
            return new ProductA();
        } else {
            return new ProductB();
        }
    }
}
