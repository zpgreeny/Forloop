import javax.swing.*;
import java.util.Scanner;

public class fast {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++) {
            System.out.printf("%3d %S%n", i, evenOrdOdd(i));

        }
    }

    public static String evenOrdOdd(int i) {

            if(i %2==0)


         return "even";
        else
         return "odd";
    }
}

