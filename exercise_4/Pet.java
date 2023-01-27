public class Pet {
    
    String name;
    Person owner;
   
    Pet(String petName , Person ownerName) {
    this.name = petName;
    this.owner = ownerName;
    }
    void ShowOwnername() {
        System.out.println("My name is " + this.name +"My owner is " + owner.name );
    }
}
