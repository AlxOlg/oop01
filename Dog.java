public class Dog extends Animal{
    
    /**Конструктор Dog */
    public Dog() {
        this("");
    }
    public Dog(String name) {
        this(name, random.nextInt(1, 20)); // Случайный возраст по умолчанию
    }
    public Dog(String name, int age) {
        this(name, age, random.nextInt(5, 25)); // Случайная масса по умолчанию
    }
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
        super.type = "собака";
        super.voice = "Гав-гав!";
        super.typeFeed = "мяса";
        super.maxPortion = 6;
        super.movement = "пробежала";
        super.maxSpeed = 30;
        super.benefit = "напугала прохожих";
        super.maxProfit = 10;
        //*Пополнение запасов корма при инициализации животного */
        Feed.increaseFeed(typeFeed, 100); // Не получилось переопределить метод и инкапсулировать
    }
}
