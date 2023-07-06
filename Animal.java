import java.util.ArrayList;
import java.util.Random;

//*Базовый класс */
public class Animal {

    /**Список кличек и индекс для кличек по умолчанию */
    protected static Random random;
    protected static ArrayList<String> names;
    protected static int defaultIndex;
    static {
        random = new Random();
        names = new ArrayList<String>();
        defaultIndex = 1;
    }

    protected String type; // Вид животного
    protected String name; // Кличка
    protected int age; // Возраст
    protected int weight; // Масса
    protected String voice; // Голос

    protected String typeFeed; // Корм
    protected int maxPortion; // Порция корма за 1 раз
    protected int eaten; // Всего съедено

    protected String movement; // Движение
    protected int maxSpeed; // Перемещение за 1 раз
    protected int totalDistance; // Пройденный путь

    protected String benefit; // Польза
    protected int maxProfit; // Количество пользы за 1 раз
    protected int totalProfit; // Всего пользы

    /**Конструктор животного */
    public Animal(String name, int age, int weight) {
        if (age < 0) {
            throw new IllegalArgumentException("age must be positive");
        }
        if (weight < 0) {
            throw new IllegalArgumentException("weight must be positive");
        }
        if (name.isEmpty() || Animal.names.indexOf(name) != -1) {
            this.name = String.format("Кличка_%d", defaultIndex++);
        } else {
            this.name = name;
        }
        Animal.names.add(this.name);
        this.age = age;
        this.weight = weight;
    }

    /**Подача голоса */
    public void makeVoice() {
        System.out.println(type + " " + name + " голос: " + voice);
    }

    /**Движение животного */
    public void move() {
        int distance = random.nextInt(maxSpeed); // Перемещение = случайное от 0 до maxSpeed
        totalDistance += distance; // Всего перемещение
        System.out.println(type + " " + name + " " + movement + " на: " + distance);
    }

    /**Полезная работа животного */
    public void work() {
        int profit = random.nextInt(maxProfit);  // Польза = случайное от 0 до maxProfit
        totalProfit += profit; // Всего пользы
        System.out.println(type + " " + name + " " + benefit + ": " + profit);
    }

    /**Питание животного */
    public void eat() {
        int portion = random.nextInt(maxPortion); // Порция корма = случайное от 0 до maxPottion
        if (Feed.decreaseFeed(typeFeed, portion)) { // Если извлечение корма из запаса произведено
            eaten += portion; // Всего съедено
            System.out.println(type + " " + name + " съела " + typeFeed + ": " + portion);
        }
    }

    /**Вывод информации */
    @Override
    public String toString() {
        return
            type + " " + name + 
            ", возраст: " + age + 
            ", масса: " + weight + 
            ", съела " + typeFeed + ": " + eaten + 
            ", " + movement + ": " + totalDistance + 
            ", " + benefit + ": " + totalProfit;
    }
}
