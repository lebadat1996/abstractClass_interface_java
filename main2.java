package AbstractClassAndInterface.fruit;

public class main2 {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
