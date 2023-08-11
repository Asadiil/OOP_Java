public abstract class Fruit {
    //Поле класса (у каждого фрукта есть вес, но у каждого типа фруктов свой)
    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}