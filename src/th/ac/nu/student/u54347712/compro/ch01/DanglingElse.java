
package th.ac.nu.student.u54347712.compro.ch01;


public class DanglingElse {

    
    public static void main(String[] args) {
        int x = 5;
        if (x<5)
            if (x<5)
                System.out.print('b');
        else
                System.out.print('a');
        
    }
}