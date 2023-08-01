package task_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Market market = new Market("Зоомагазин классных котиков", 10);
        market.stock = new ArrayList<>();
        market.stock.add(0, "Клиент1");
        market.stock.add(0, "Клиент2");
        market.stock.add(0, "Клиент3");
        market.greetings();
        market.getIn();
        market.putPerson("Кавалер кошачьей гвардии");
        market.giveProduct("Кавалер кошачьей гвардии", market.stock, "Кошка - Тотошка");
        market.getOut();
    }
}