package ie.atu.productv5;

public class Tv extends Product {
    private String screenSize;

    public Tv() {
        super();
        screenSize = "";
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScreen size is " + screenSize + "\"";
    }
}
