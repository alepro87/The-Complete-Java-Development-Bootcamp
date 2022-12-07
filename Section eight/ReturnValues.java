public class ReturnValues {

    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.2);

        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");

        System.out.println("\n" + englishExplanation);
        System.out.println(frenchExplanation);
        System.out.println(spanishExplanation);
        System.out.println(italianExplanation);
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENTIONS");
            System.exit(0);
        }
        double area = width * length;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish": 
                return "area es igual a largo * ancho";
            default:
                return "Language is not available";
        }
    }

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"
}
