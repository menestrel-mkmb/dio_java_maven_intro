package one.digitalinnovation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user1 = new User("João", "Jao");
        User user2 = new User("Maria", "Maah");

        user1.block();
        user2.disable();
        user2.enable();

        System.out.println(user1.getUsername());
        System.out.println(user1.getStatus());

        System.out.println(user2.getUsername());
        System.out.println(user2.getPassword());
        System.out.println(user2.getStatus());


    }
}
