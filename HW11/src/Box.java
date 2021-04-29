public class Box {
    private int storage;
    private float weight = 0;
    private float BoxWeight = 0;
    private String type;

    Box(Orange org, int number) {
        weight = org.getWeight();
        storage = number;
        BoxWeight = weight * storage;
        type = "Orange";
    }

    Box(Apple apple, int number) {
        weight = apple.getWeight();
        storage = number;
        makeBoxWeight();
        type = "Apple";
    }

    public void makeBoxWeight() {
        BoxWeight = weight * storage;
    }

    public void getInfo() {
        System.out.println("-------------");
        System.out.println("Contain-" + storage + " " + type);
        System.out.println("Weight-" + BoxWeight + " kg");
    }

    public boolean compare(Box box) {
        if (this.BoxWeight == box.BoxWeight) {
            return true;
        } else {
            return false;
        }
    }

    public void replace(Box box) {
        if (this.type == box.type) {
            box.storage = box.storage + this.storage;
            box.BoxWeight = box.storage * box.weight;
            this.storage = 0;
            this.weight = 0;
            this.type = "Nothing";
            this.BoxWeight = 0;
        } else {
            System.out.println("You can't put Apples with Oranges or Oranges with Apples");
        }
    }

    public void addFruits(int x) {
        this.storage = this.storage + x;
        makeBoxWeight();
    }


}
