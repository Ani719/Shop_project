
public class Shop {
    public static void main(String[] args) {
        Watches watch = new Watches( "Orient", "RC-65", 500000);

        Category accessories  = new Category("Accessories");
        accessories.addProduct(watch);
        accessories.toSellProduct(watch);

        User ani = new User("Ani Manukyan", "animanukyan@gmail.com", "+37478458989");


        Registration register = new Registration();
        register.createAccount(ani);

    }
}
