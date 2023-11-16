package factory;

public class Rose implements  Flower{
     private String color;

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     @Override
     public String blooming() {
          return "The rose is in its full bloom!";
     }

     @Override
     public String fragrance() {
          return "smells nice!";
     }
}
