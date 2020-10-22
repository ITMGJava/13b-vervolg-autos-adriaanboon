public class AutoVervolgTest {
    public static void main(String[] args) {
        //Auto auto= new Auto("Tesla");
        //System.out.println(auto.getMerk());
        //System.out.println(auto.getKilometerStand());
        //System.out.println(auto.getSnelheid());

        Auto tesla = new Auto("Tesla");
        System.out.println(tesla.getMerk());
        System.out.println(tesla.getKilometerStand());
        System.out.println(tesla.getSnelheid());
        System.out.println(tesla.motorGegevens());
    }
}
