public class App {
    public static void main(String[] args) throws Exception {
        
        GroceryItem item1 = new GroceryItem();

        item1.name = "Tissue";

        item1.showItemName();

        GroceryItem item2 = new Toothbrush();
        item2.name = "Colgate Gold";
        item2.price = 500;
        item2.showItemName();

        GroceryItem item3 = new Toothpaste();
        item3.name = "Pepsodent Platinum";
        item3.price = 100;
        item3.showItemName();

        Cashier c1 = new Cashier();
        c1.checkOut(item2);
        c1.checkOut(item3);

         c1.showprice(item2);
         c1.showprice(item3);
    

         GroceryItem[] itemArray = new GroceryItem[2];
         itemArray[0] = item2;
         itemArray[1] = item3;

         for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
         }
         Dragon myDragon = new Dragon();
         myDragon.breathfire();
         myDragon.eat();
         
         Dragoon myDragoon = new Dragoon();
         myDragoon.walk();
         myDragoon.fly();
    }
}
