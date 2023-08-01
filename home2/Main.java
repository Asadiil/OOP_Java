package task_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Market market = new Market("Магазин", 10);
        market.stock = new ArrayList<>();
        market.stock.add(0, "Клиент1");
        market.stock.add(0, "Клиент2");
        market.stock.add(0, "Клиент3");
        market.greetings();
        market.getIn();
        market.putPerson("Покупатель");
        market.giveProduct("Покупатель", market.stock, "Клиент1");
        market.getOut();
    }
}