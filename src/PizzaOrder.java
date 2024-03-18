public class PizzaOrder {
    public enum Size {
        SMALL, MEDIUM, BIG
    }

    private String name;
    private Size size;
    private boolean sauceNeeded;
    private String deliveryAddress;
    private boolean orderAccepted;

    public PizzaOrder(String name, Size size, boolean sauceNeeded, String deliveryAddress) {
        this.name = name;
        this.size = size;
        this.sauceNeeded = sauceNeeded;
        this.deliveryAddress = deliveryAddress;
        this.orderAccepted = false;
    }

    public void order() {
        if (orderAccepted) {
            System.out.println("Заказ уже принят.");
        } else {
            orderAccepted = true;
            System.out.println("Заказ принят. " + size + " пицца " + name + " с соусом на адрес " + deliveryAddress + ".");
        }
    }

    public void cancel() {
        if (orderAccepted) {
            System.out.println("Заказ отменен.");
            orderAccepted = false;
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSauceNeeded() {
        return sauceNeeded;
    }

    public void setSauceNeeded(boolean sauceNeeded) {
        this.sauceNeeded = sauceNeeded;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String toString() {
        return "PizzaOrder{" +
                "name: " + name +
                ", size: " + size +
                ", sauceNeeded: " + sauceNeeded +
                ", deliveryAddress: " + deliveryAddress +
                ", orderAccepted: " + orderAccepted +
                '}';
    }

    static class Main {
        public static void main(String[] args) {
            PizzaOrder pizzaOrder = new PizzaOrder("Аль-Капчоне", Size.MEDIUM, true, "Альбукерке, Бертон-Парк");

            System.out.println("Информация о заказе: ");
            System.out.println(pizzaOrder);

            pizzaOrder.order();
            pizzaOrder.cancel();
            pizzaOrder.cancel();
        }
    }

}
