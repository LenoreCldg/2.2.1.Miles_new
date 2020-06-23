public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int milesSmallPrice = service.calculate(10, 20);
        System.out.println(milesSmallPrice);

        int milesBigPrice = service.calculate(3_300_000, 20);
        System.out.println(milesBigPrice);

        int milesZeroPrice = service.calculate(0, 20);
        System.out.println(milesZeroPrice);

    }
}