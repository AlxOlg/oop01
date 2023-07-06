public class Bird extends Animal{
    
    /**Конструктор Bird */
    public Bird() {
        this("");
    }
    public Bird(String name) {
        this(name, random.nextInt(1, 15)); // Случайный возраст по умолчанию
    }
    public Bird(String name, int age) {
        this(name, age, random.nextInt(2, 5)); // Случайная масса по умолчанию
    }
    public Bird(String name, int age, int weight) {
        super(name, age, weight);
        super.type = "птица";
        super.voice = "Ко-ко!";
        super.typeFeed = "зерна";
        super.maxPortion = 4;
        super.movement = "пролетела";
        super.maxSpeed = 30;
        super.benefit = "снесла яиц";
        super.maxProfit = 10;
        //*Пополнение запасов корма при инициализации животного */
        Feed.increaseFeed(typeFeed, 100); // Не получилось переопределить метод и инкапсулировать
    }
}
