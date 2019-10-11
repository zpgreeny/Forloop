public class Forloopchallenge {
    public static void main(String[] args) {


        for(int i = 1; i <= 100; i++) {
            System.out.printf("%3d . ", i);
            if (i%15 == 0) {
               System.out.printf(" fizzbuzz ");
            }
            else if((i%5) == 0){
                System.out.printf(" buzz ");
            }
            else if((i%3) == 0){
                System.out.printf(" fizz ");
            }



            System.out.println();



        }
    }
}
