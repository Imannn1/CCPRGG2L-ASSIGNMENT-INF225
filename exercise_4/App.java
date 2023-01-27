public class App {
    public static void main(String[] args) throws Exception {
       
      Person friend = new Person("Eman" , 18);

      Myself me = new Myself("Emman" , 19);

      Pet dragon = new Pet("Ragna" ,friend );

      Car race = new Car("GT7", "Emman" );

      me.Addfriend(friend);
      dragon.ShowOwnername();
      race.CarOwner();
    }
}
