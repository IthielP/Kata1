package kata1;

import java.util.Date;

/**
 *
 * @author Ithiel
 */
public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person ("Lucas",new Date (99,4,31));
        Person person2 = new Person ("Garoe", new Date (99,11,19));
        System.out.println(person.getName()+ " tiene " + person.getAge());
        System.out.println(person2.getName()+ " tiene " + person2.getAge());
    }
    
}
