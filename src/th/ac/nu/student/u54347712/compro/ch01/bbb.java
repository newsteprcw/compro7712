
package th.ac.nu.student.u54347712.compro.ch01;

import java.util.Scanner;
public class bbb {

    
    public static void main(String[] args) {
        
int num ;

Scanner in = new Scanner(System.in);
System.out.print("Please enter in first integer:");
int x = in.nextInt();

System.out.print("Please enter in second integer:");
int y = in.nextInt();

int maxnumber = x|y ;
int minnumber = x|y ;

System.out.print("The sum:");
System.out.println(x + y);

System.out.print("The difference:");
System.out.println(x - y);

System.out.print("The Product:");
System.out.println(x * y);

System.out.print("The aaverage:");
System.out.println((x + y) / 2);

System.out.print("The distance:");
System.out.println(Math.abs(x - y));

System.out.println("max(" + x+ "," + y + ") is " + Math.max(x,y));
System.out.println("min(" + x + "," + y + ") is " + Math.min(x,y));
    }
}
