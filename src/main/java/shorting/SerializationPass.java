package shorting;

import java.io.Serializable;

public class SerializationPass implements Serializable {
String name ="AShfak";
transient String Pass ="ASfhak";

private void writeOutput(){
    String encode="123";
    this.Pass +=encode;
//    System.out.println(pass);
}
}
