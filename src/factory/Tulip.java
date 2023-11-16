package factory;

public class Tulip implements  FLower{
    private Integer noOfPetals;

    public Integer getNoOfPetals() {
        return noOfPetals;
    }

    public void setNoOfPetals(Integer noOfPetals) {
        this.noOfPetals = noOfPetals;
    }
    @Override
    public String bloom() {
        return "The flower is blooming!";
    }

    @Override
    public String fragrance() {
        return "The flower smells good!";
    }
}
