package midterm;

import java.util.Scanner;
import midterm.DriverPermit.*;

/**
 * This class +++ Insert class description here+++
 *
 * @author Tarick Wilson
 */
public class index {

    static int cat;
    static Scanner input = new Scanner(System.in);
    static String permitNo;

    public static void main(String[] args) {

        

        getPermNo();
        getCat();
  

    }

    public static void getPermNo() {

        System.out.println("Enter 9 digit permit number");
        permitNo = input.next();
    }

    public static void getCat() {
        DriverPermit d = new DriverPermit();
        System.out.println("Enter number to Select category");
        for (int i = 0; i < DriverPermit.categories.values().length; i++) {
            System.out.println((i + 1) + ": " + DriverPermit.categories.values()[i]);
        }
        System.out.print(">");
        cat = input.nextInt();
        boolean permitValid = d.isValid(permitNo);
        
        if (permitValid) {
            System.out.println("permit created");
            
            switch(cat) {
  case 1:
    d = new DriverPermit(permitNo,"G1");
    break;
  case 2:
    d = new DriverPermit(permitNo,"G2");
    break;
    case 3:
    d = new DriverPermit(permitNo,"G");
    break;
  case 4:
    d = new DriverPermit(permitNo,"M");
    break;
    case 5:
    d = new DriverPermit(permitNo,"Tarick_CATEGORY");
    break;
  default:
    d = new DriverPermit(permitNo,"Tarick_CATEGORY");
}
            
            
        } else {
            System.out.println("Invalid permit number");
            getPermNo();
            getCat();
        }
        
    }
}
