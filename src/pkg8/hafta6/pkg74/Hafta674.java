
package pkg8.hafta6.pkg74;

import java.util.Locale;
import java.util.Scanner;


public class Hafta674 {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
       
      
        System.out.println("please enter the number of terms: ");
         int n= input.nextInt();
        
         System.out.println("please enter the X value  to be calculated: ");
         double x= input.nextDouble();
        
          
          double t=1 ,f=1;
          
          for(int i=1; i<n; i++){
          
              f*=i;
             
              t+=Math.pow(x, i)/f;
          }
          
          System.out.printf("\nSeri acilimi ile e uzeri x degeri: %.5f\n", t);
           System.out.printf("x value over e by command: %.5f\n", Math.exp(x));
    }
    
}
