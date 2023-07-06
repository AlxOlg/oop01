public class Cat extends Animal{

    /**Конструктор Cat */
    public Cat() {
        this("");
    }
    public Cat(String name) {
        this(name, random.nextInt(1, 20)); // Случайный возраст по умолчанию
    }
    public Cat(String name, int age) {
        this(name, age, random.nextInt(2, 8)); // Случайная масса по умолчанию
    }
    public Cat(String name, int age, int weight) {
        super(name, age, weight);
        super.type = "кошка";
        super.voice = "Мур-мяу!";
        super.typeFeed = "мяса";
        super.maxPortion = 4;
        super.movement = "прыгнула";
        super.maxSpeed = 20;
        super.benefit = "поймала мышей";
        super.maxProfit = 10;
        //*Пополнение запасов корма при инициализации животного */
        Feed.increaseFeed(typeFeed, 100); // Не получилось переопределить метод и инкапсулировать
    }
}
