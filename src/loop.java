import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int num1;
        int num2;
        int multi;
        int num3;
        int num4;
        int sum1 = 0;
        int sum2 =0;
        int inp1;






        Scanner input = new Scanner(System.in);
        System.out.print("1)" + " Enter a number: ");
        num1 = input.nextInt();


        for (int x=0; x<=num1; x++) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.print("2)" + " Enter a number: ");
        num2 = input.nextInt();

        for(int x=0; x<=10; x++){
            multi = num2 * x;
            System.out.println(x + "x" + num2 + "=" + multi );


        }
        System.out.println();
        System.out.print("3)" + " Enter a number and the system will print the odd numebrs and the sum of those odd numbers : ");
         num3=input.nextInt();

         for (int x=0; x<=num3; x++){
             if(x % 2 != 0){
                 System.out.print(  x + " ");
                 sum1 = x + sum1;
             }
         }
         System.out.print("sum= " + sum1);


        System.out.println();
        System.out.print("4)" + " Enter a number and the system will print the even numebrs and the sum of those even numbers: ");
        num4=input.nextInt();

        for (int x=0; x<=num4; x++){
            if(x % 2 == 0){
                System.out.print( x + " ");
                sum2 = x + sum2;
            }
        }
        System.out.print("sum= " + sum2);


        System.out.print("5)" + " Enter a number: ");
        inp1 = input.nextInt();


        for (int h=1; h<=inp1; h++){
           for(int x=1; x<=h; x++) {
               System.out.print(x);

           }
            System.out.println();
        }



      System.out.print("7)" + " Enter a number: ");
        inp1 = input.nextInt();


        for (int h=1; h<=inp1; h++){
            for(int x=1; x<=h; x++) {
                System.out.print(h);

            }
            System.out.println();
        }


        System.out.print("8)" + " Enter a number: ");
        inp1 = input.nextInt();

        int counter = 0;
        for (int h=1; h<=inp1; h++){
            for(int x=1; x<=h; x++) {
                counter++;
                System.out.print(counter + " ");

            }
            System.out.println();
        }


        System.out.println("9)" + " Enter a number: ");
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % 2 == 0 && j % 2 != 0) {
                    System.out.print(0 + " ");
                }
                else if (i % 2 != 0 && j % 2 == 0){
                    System.out.print(0 + " ");
                }else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }


        System.out.print("10)" + " Enter a number: ");
        String num = input.nextLine();
        boolean palindrome = true;

        for (int i = 0; i < num.length() / 2 ; i++) {
            if (num.charAt(i) != num.charAt(num.length() - (1+i))){
                palindrome = false;
                break;
            }
        }
        if(palindrome == true){
            System.out.println(num + " is palindrome.");
        } else{
            System.out.println(num + " is not palindrome.");
        }

        int sum3 = 0;
        System.out.println("10) ");
        for (int x=100; x<=200; x++){
            if(x % 9 == 0){
                sum3 = sum3 + x;

            }
        }
        System.out.println(sum3);













    }

}
