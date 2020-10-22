public class Auto {
    private int snelheid;
    private int kilometerstand;
    private String merk;
    static String motorgegevens="Motor: Colombo V12 580 pk 980 kg 3,8 liter";

   // public Auto() {
    // snelheid=0;
    // merk="Toyota";
    // kilometerstand=20000;
   // }

    public Auto(String merk) {
        snelheid=0;
        this.merk=merk;
    }
    public static String motorGegevens() {
        return motorgegevens;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    int getKilometerStand() {
        return kilometerstand;
    }
    void setKilometerstand(int kilometerstand) {
        this.kilometerstand=kilometerstand;
    }
    int getSnelheid() {
        return snelheid;
    }
    void setSnelheid(int snelheid) {
        this.snelheid=snelheid;
    }
}
