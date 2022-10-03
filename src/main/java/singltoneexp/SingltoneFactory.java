package singltoneexp;

public class SingltoneFactory {

    //    class Singleton {
    // Static variable reference of single_instance
    // of type Singleton
//        private static SingltoneFactory single_instance = null;
//
//        // Declaring a variable of type String
//        public String s;
//
//        // Constructor
//        // Here we will be creating private constructor
//        // restricted to this class itself
//        private SingltoneFactory()
//        {
//            s = "Hello I am a string part of Singleton class";
//        }
//
//        // Static method
//        // Static method to create instance of Singleton class
//        public static SingltoneFactory getInstance()
//        {
//            if (single_instance == null)
//                single_instance = new SingltoneFactory();
//
//            return single_instance;
//        }
//    }
    private static SingltoneFactory instance = null;

    private SingltoneFactory() {
    }

    public static SingltoneFactory getInstance() {
        if (instance == null) {
            instance = new SingltoneFactory();
            return instance;
        }
        return instance;
    }

    // Class 2
// Main class
    class GFG {
        // Main driver method
        public static void main(String args[]) {
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

            // Condition check
            if (x == y && y == z) {

                // Print statement
                System.out.println(
                        "Three objects point to the same memory location on the heap i.e, to the same object");
            } else {
                // Print statement
                System.out.println(
                        "Three objects DO NOT point to the same memory location on the heap");
            }
        }
    }
}


