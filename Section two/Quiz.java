public class Quiz {
    public static void main(String[] args) {
        int apples = 50;
        int goneBad = 5;
        int rotten = 20;
        int sold = 20;
 
        apples -= goneBad;
        apples -= rotten;
        apples -= sold;
    
        System.out.println(apples);

    }
}
