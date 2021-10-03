public class Animal {
    public Animal(boolean vegeterian, String eat, int noOfLegs) {
    }
    public class Cat extends Animal {
        String color;
        public Cat(boolean vegeterian, String eat, int noOfLegs,String color) {
            super(vegeterian, eat,noOfLegs);
            this.color = color;
        }
    }
}