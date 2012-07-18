package th.ac.nu.student.u54347712.compro.ch01;
import java.util.Scanner;
public class Exercises2 {
    public static void main(String[] args) {        
        int num ;
        int x;
        int y;        
        Scanner s = new Scanner(System.in);        
        System.out.print("ใส่ค่า x : ");
        x = s .nextInt();       
        System.out.print("ใส่ค่า y : ");
        y = s .nextInt();        
        int maxnumber = x|y ;
        int minnumber = x|y ;       
        System.out.println(x+y+(" = Sum"));
        System.out.println(x-y+(" = Difference"));
        System.out.println(x*y+(" = Product"));
        System.out.println((x+y)/2+(" = Average"));
        System.out.println(Math.abs(x - y)+(" = distance"));
        System.out.println("max(" + x+ "," + y + ") = " + Math.max(x,y));
        System.out.println("min(" + x + "," + y + ") = " + Math.min(x,y));        
    }
}