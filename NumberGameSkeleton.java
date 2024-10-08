package testing;
import java.util.Random;
import java.util.Scanner;

public class NumberGameSkeleton {
    public static void main(String[] args){

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = random.nextInt(20);


        System.out.println("Guess the random number!");
        while (true){
        int a = sc.nextInt();
        if (a > randomNumber){
            System.out.println("Too High, try again");
        } else if (a < randomNumber) {
            System.out.println("Too low, try again");
        } else if (a == randomNumber){
            System.out.println("Correct");
            return;

        }


    }

}}
