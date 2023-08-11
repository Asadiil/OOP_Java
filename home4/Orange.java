public class Orange extends Fruit{
    // данный конструктор оставил на случай если захочу менять вес апельсина при создании
    // так как класс Fruit абстрактный IDE сразу заставляет переопределить конструктор...
    public Orange(float weight) {
        super(weight);
    }

    public Orange() {
        super(1.5f); // согласно задания вес одного апельсина 1.5f
    }

}