public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;

        if (chemistryGrade > 75 || englishGrade > 75) {
            System.out.println("Congratulations, You got the scholarship!");
        } else {
            System.out.println("We're sorry, you didn't get the scholarship.");
        }

        int credits = 56;
        double GPA = 3.6;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma!");
        } else {
            System.out.println("Sorry, you need at least 40 credits and a minimus GPA of 2.0");
        }
    }
}
