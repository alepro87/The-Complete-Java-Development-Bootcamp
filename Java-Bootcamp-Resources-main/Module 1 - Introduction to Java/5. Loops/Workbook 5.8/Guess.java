import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        int secret = (int)(Math.random() * 5) + 1;
        int guess = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        guess = scan.nextInt();
        
        while (secret != guess) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }

        System.out.println("You got it!");
        //See Learn the Part for detailed instructions.
        
        scan.close();
    }

}
