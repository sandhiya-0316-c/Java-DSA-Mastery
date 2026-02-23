public class Map {
    public static void main(String[] args) {

        Mapsum obj = new Mapsum();

        obj.insert("apple", 3);
        System.out.println(obj.sum("ap")); // 3

        obj.insert("app", 2);
        System.out.println(obj.sum("ap")); // 5
    }
}