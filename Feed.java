//*Класс "корм" */
import java.util.HashMap;

public class Feed {

    public static HashMap<String, Integer> feedHashMap;
    static {
        feedHashMap = new HashMap<>();
    }

    /**Пополнение запасов корма */
    public static void increaseFeed(String feed, int dose) {
        if (feedHashMap.containsKey(feed)) {
            dose += feedHashMap.get(feed);
        }
        feedHashMap.put(feed, dose);
    }

    /**Извлечение запасов корма */
    public static boolean decreaseFeed(String feed, int dose) {
        if (feedHashMap.containsKey(feed) && feedHashMap.get(feed) >= dose) { // Если корм в наличии
            dose = feedHashMap.get(feed) - dose;
            feedHashMap.replace(feed, dose);
            return true;
        } else {
            return false;
        }
    }
}
