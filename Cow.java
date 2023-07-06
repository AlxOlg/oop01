public class Cow extends Animal{

    /**Конструктор Cow */
    public Cow() {
        this("");
    }
    public Cow(String name) {
        this(name, random.nextInt(3, 15)); // Случайный возраст по умолчанию
    }
    public Cow(String name, int age) {
        this(name, age, random.nextInt(200, 600)); // Случайная масса по умолчанию
    }
    public Cow(String name, int age, int weight) {
        super(name, age, weight);
        super.type = "корова";
        super.voice = "Му-у!";
        super.typeFeed = "сена";
        super.maxPortion = 20;
        super.movement = "прошла";
        super.maxSpeed = 6;
        super.benefit = "дала молока";
        super.maxProfit = 20;
        //*Пополнение запасов корма при инициализации животного */
        Feed.increaseFeed(typeFeed, 100); // Не получилось переопределить метод и инкапсулировать
    }
}
