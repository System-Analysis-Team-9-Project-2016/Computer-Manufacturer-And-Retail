public class Laptop extends ComputerSystem {
    private boolean gamingLaptop;
    private int screenSize;
    private int screenRez;
    private double weight;


    public Laptop(int productId, String productName, int stock, double unitCost, boolean isActive, boolean isProductDiscount, String OS, boolean gamingLaptop, int screenSize, int screenRez, double weight) {
        super(productId, productName, stock, unitCost, isActive, isProductDiscount, OS);
        this.gamingLaptop = gamingLaptop;
        this.screenSize = screenSize;
        this.screenRez = screenRez;
        this.weight = weight;
    }

    public boolean isGamingLaptop() {
        return gamingLaptop;
    }

    public void setGamingLaptop(boolean gamingLaptop) {
        this.gamingLaptop = gamingLaptop;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getScreenRez() {
        return screenRez;
    }

    public void setScreenRez(int screenRez) {
        this.screenRez = screenRez;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}