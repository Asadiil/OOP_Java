public static void main(String[] args) {
    System.out.println("Введите заказ:");
    OrderInput orderInput = new OrderInput();
    Order order = orderInput.inputFromConsole();
    
    OrderOutput orderOutput = new OrderOutput();
    orderOutput.saveToJson(order);
}