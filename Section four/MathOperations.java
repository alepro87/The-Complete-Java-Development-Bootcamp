/**
 * MathOperations
 */
public class MathOperations {

    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAdnromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay + starsInAdnromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled");

        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAdnromeda - starsInMilkyWay) + " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScore - bonusMarks) + " on his potions test");

        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweets1*bagOfSweets2));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore*bonusMarks) + "/10");

        System.out.println("Originally, Fred had " + (bagOfSweets2/bagOfSweets1) + " times more sweets than George");
        System.out.println("Andromeda has " + (starsInAdnromeda/starsInMilkyWay) + " times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore/bonusMarks));

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10%2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5%2));
    }
}

// Fred and George collected <result> sweets
// There are <result> stars in the Milky Way and Andromeda galaxies.
// With bonus marks, Ron scored <result>/10 on his potions test. Snape wasn't too thrilled

// Fred has  <result>  more sweets than George
// The Andromeda Galaxy has <result> more stars than the Milky Way
// Snape ended up removing marks. Ron actually scored <result> on his potions test

// Fred and George used a special spell to multiply their sweets to: <result>
// Snape made an error on his excel, accidentally multiplying Ron's score to: <result>/10

// Originally, Fred had  <result> times more sweets than George
// Andromeda has <result> times more stars
// Snape caught the error. Furious, he divided Ron's score to: <result>


// 10 is an even number, since dividing 10 by 2 has a remainder of: <remainder>

// 5 is an odd number, since dividing 5 by 2 has a remainder of: <remainder>