import java.util.HashMap;

public class Hashmap {
    public static void main (String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("jake" , 10);
        map.put("caes" , 20);
        map.put("olive" , 30);
        System.out.println("numbers of students" + map.get("jake"));
        System.out.println("All students" + map);

    }
}
