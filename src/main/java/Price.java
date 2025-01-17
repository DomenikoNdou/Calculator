public class Price {


    private static final int pricePerHour = 3;
    private static final float pricePerMinute = 3 / 60;
    private static final int minutes = 60;


    public float calculatePrice(Integer start, Integer end) {
        if (start < 0 || end < 0 || start > 1440 || end > 1440) {
            throw new IllegalArgumentException("Start und Endzeit müssen zwischen 0 und 1440 liegen.");
        }

        if (end <= start) {
            throw new IllegalArgumentException("Endzeit muss nach der Startzeit liegen.");
        }

        int totalMinutes = end - start;



        return  totalMinutes * pricePerMinute;

    }



    public static void main(String[] args) {
        Price priceCalculator = new Price();

        System.out.println("Start 510 und End 600");
        System.out.println("Preis: " + priceCalculator.calculatePrice(510, 600) + "€");


    }
}
