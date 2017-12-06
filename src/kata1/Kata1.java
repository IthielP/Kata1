package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Ithiel
 */
public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1999,4,31);
        Person person = new Person ("Lucas",date);
        date.set(1999,11,19);
        Person person2 = new Person ("Garoe", date);
        System.out.println(person.getName()+ " tiene " + person.getAge() + " años");
        System.out.println(person2.getName()+ " tiene " + person2.getAge() + " años");
    }
    
}
