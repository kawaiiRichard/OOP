public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер телефона: " + callerNumber);
    }

    public void sendMessage(String[] numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public String toString() {
        return "Phone {" +
                "number = " + number + '\'' +
                ", model = " + model + '\'' +
                ", weight = " + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("01010011011100000110100101110010011010010111010001001101011000010110001101101000011010010110111001100101", "Adeptus Mechanicus's vox", "0.3");
        Phone phone2 = new Phone("360045458", "Adepta Sororitas's vox", "0.1");
        Phone phone3 = new Phone("26346163689", "TikTokPhone", "0.5");

        phone2.receiveCall("Анатолий Бензин", "89115889033");

        System.out.println();

        String[] numbers = {"883213211235", "0110101101110", "675675675675675675"};
        phone3.sendMessage(numbers);

        System.out.println();

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
    }
}