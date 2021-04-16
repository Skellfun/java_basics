public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Butter", 40, 2);
        basket.add("Potato", 30, 2.5);
        basket.add("Carrot", 25, 2, 1.3);
        basket.print("My Basket");
        basket.clear();

        Arithmetic arithmetic = new Arithmetic(5, 3);
        arithmetic.summ();
        arithmetic.diff();
        arithmetic.mean();
        arithmetic.prod();
        arithmetic.min();
        arithmetic.max();
    }
}
