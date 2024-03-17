import java.util.HashMap;

public class ExampleHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store Student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        studentMap.put(1, "Dimpal");
        studentMap.put(2, "Ganesh");
        studentMap.put(3, "Kiran");
        studentMap.put(4, "Divya");
        studentMap.put(5, "Emily");
        studentMap.put(6, "Tushar");
        studentMap.put(7, "Gargi");
        studentMap.put(8, "Hansi");
        studentMap.put(9, "Isani");
        studentMap.put(10, "soni");

        // Display the contents of the HashMap
        System.out.println("HashMap contents:");
        for (Integer id : studentMap.keySet()) {
            String name = studentMap.get(id);
            System.out.println("Student ID: " + id + ", Name: " + name);
        }
    }
}
