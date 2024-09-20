public class MaintenanceCost {
    public static void main(String[] args) {
        System.out.println("Input costs for each season below!");

        double springCost = 1;
        double summerCost = 2;
        double fallCost = 3;
        double winterCost = 4;
        double totalCost = springCost+ summerCost+ fallCost + winterCost;

        System.out.println("Your cost for spring was " + springCost);
        System.out.println("Your cost for summer was " + summerCost);
        System.out.println("Your cost for fall was " + fallCost);
        System.out.println("Your cost for winter was " + winterCost);

        System.out.println("Your entire cost for the year was" + totalCost);


    }
}