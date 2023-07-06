public class pets {

   public static void main(String[] args) {
      Animal[] animals = new Animal[4];

      animals[0] = new Bird("Ряба");
      animals[1] = new Cat("Мурка");
      animals[2] = new Cow("Бурёнка");
      animals[3] = new Dog("Жучка");

      System.out.println("Запас корма: " + Feed.feedHashMap);
      System.out.println("------------------------------");
      for (Animal item : animals) {
         System.out.println(item);
         item.makeVoice();
         item.move();
         item.work();
         item.eat();
         System.out.println(item);
         System.out.println("------------------------------");
      }
      System.out.println("Запас корма: " + Feed.feedHashMap);
   }
}
