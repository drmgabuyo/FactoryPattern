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
        return "is not blooming!";
    }

    @Override
    public String fragrance() {
        return "smells weird!";
    }
}
