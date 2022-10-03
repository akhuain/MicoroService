package singltoneexp;

public class SingletonClass {
    public static void main (String [] args){

        System.out.println("Revert String ==============");
        StringBuffer reverse = ReverseStrng.reverse();
        System.out.println(reverse);
        System.out.println("this is for Singltome calls ");
        SingltoneFactory getinstance =SingltoneFactory.getInstance();

        System.out.println("this is my first instatnce " +getinstance + " and " +getinstance.hashCode());
        SingltoneFactory getinstance2 =SingltoneFactory.getInstance();

        System.out.println("this is my first instatnce2   " +getinstance2 + " and " +getinstance2.hashCode());



        // Instantiating Singleton class with variable x
        SingltoneFactory x = SingltoneFactory.getInstance();

        // Instantiating Singleton class with variable y
        SingltoneFactory y = SingltoneFactory.getInstance();

        // Instantiating Singleton class with variable z
        SingltoneFactory z = SingltoneFactory.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());
    }

}
