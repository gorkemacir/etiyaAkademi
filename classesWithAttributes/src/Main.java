public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product._name="Laptop";
        product._id=1;
        product._description="Asus Laptop";
        product._price=5000;
        product._stockAmount=3;
        System.out.println("Hello world!");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}