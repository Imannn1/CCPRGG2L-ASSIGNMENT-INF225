public class Cashier {
    
    public void showprice(GroceryItem item){
        System.out.println("This cost " + item.price);
    }

    public void checkOut(GroceryItem item) {
        System.out.println("You have bought "+ item.name );
    }

}
