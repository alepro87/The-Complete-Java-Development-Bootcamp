public class WhileLoops {
    public static void main(String[] args) {
        double choose = 0.01;
        double guess = 0.99;

        while (choose < guess) {
            guess = Math.random();
            System.out.println(guess);
        }
    }
}
