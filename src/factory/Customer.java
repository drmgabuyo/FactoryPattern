package factory;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a flower");
        System.out.println("1. Rose");
        System.out.println("2. Tulip");
        System.out.println("3. Exit");
        System.out.print("Enter number: ");
        Integer choice = input.nextInt();

        FlowerRecord flowerRecord = new FlowerRecord();
        Flower flower;

        switch (choice) {
            case 1:
                flower = new Rose();
                flowerRecord.setFlowerName("Rose");
                flowerRecord.setFlowerId("RS");
                flowerRecord.setFlower(flower);
                ((Rose) flower).setColor("Red");
                break;

            case 2:
                flower = new Tulip();
                flowerRecord.setFlowerName("Tulip");
                flowerRecord.setFlowerId("TP");
                flowerRecord.setFlower(flower);
                ((Tulip) pet).setNoOfPetals(6);
                break;
            case 3:
                System.exit(0);

        }

        System.out.println("Flower id is " + flowerRecord.getFlowerId());
        System.out.println("Flower name is " + flowerRecord.getFlowerName());
        System.out.println("Flower species: " + flowerRecord.getFlower().getClass().getSimpleName());
        System.out.println("Is it blooming? " + flowerRecord.getFlower().bloom());
        System.out.println("Does it smells good? " + flowerRecord.getFlower().fragrance());


    }

}
