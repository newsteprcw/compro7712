package th.ac.nu.student.u54347712.compro.ch01;
import  java.util.Scanner;
public class Exercises12 {    
  public  static  void  main(String [] args){    
    double tank = 1; 
    double gas = 20.0;
    double price = 37.23;
    double gallon = 45.6;
    double mile = 0.13;   // 1 ไมล์มี 1.60 กม./// 1 ลิตรวิ่งได้ 12 กม./// 1 แกลอนมี 45.6 ลิตร    
    System.out.print("The number of gallons of gas in the ");
    Scanner  s = new Scanner(System.in);
    System.out.print("tank:");
    tank = s.nextDouble();
    System.out.println("gas/Lit:" + gas*tank);    
    System.out.print("The fuel efficiency in miles per gallon:");
    mile = s.nextDouble();
    System.out.println("gallon/mile:" + mile * 1 /gallon);
    System.out.print("The price of gas per gallon:");
    gallon = s.nextDouble();
    System.out.println("price/gallon:" + price * tank);    
  }
}