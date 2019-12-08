package pattern.create.build;

public class Builder {
    private Product product;

    public Builder(){
        product = new Product();
    }
    public Builder buildName (String name ) {
        this.product.setName(name);
        return this;
    }
    public Product build(){
        return product;
    }
}
