package ExceptionPractice;
import java.util.Random;
import java.util.Scanner;
//public class ArrayIndexOutofBoundsException {

    public class ExcepTest {
        public static void main(String args[]) throws ArrayIndexOutOfBoundsException{

            Scanner in = new Scanner(System.in);

            try {
                int a[] = new int[100];
                Random rd = new Random();
                for (int b =0; b<=a.length;b++){
                a[b]=rd.nextInt();
                }
                System.out.println("Enter element of choice:");
                int i= in.nextInt();
                System.out.println("Access element "+i+": "+a[i] );

            }
                // System.out.println("Access element three :" + a[3]); }
            catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Exception thrown :" + e);
                }
                {
                    System.out.println("Out of the block");
                }

        }
    }


