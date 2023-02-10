public class App {
    public static void main(String[] args) throws Exception {

         Person Me = new Person();

        Me.setName("Emann");
        
        String myName = Me.getName();

        System.out.println("My name is " + myName);

        Me.setCcnumber(123214);

        int myCcnumber = Me.getCcnumber();

        System.out.println("My cc number is" + myCcnumber);

        Son me = new Son();

        System.out.println("My family name is" + me.surname);
    }
}
