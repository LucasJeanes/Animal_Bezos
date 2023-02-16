package ie.atu.productv5;

public class Dog extends Animal{
    private boolean vaccination;
    private String shedding;
    private boolean neutered;

    public Dog() {
    }

    public boolean isVaccination() {
        return vaccination;
    }

    public void setVaccination(boolean vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", vaccination='" + vaccination + '\'' +
                ", shedding='" + shedding + '\'' +
                ", neutered='" + neutered + '\'';
    }
}
