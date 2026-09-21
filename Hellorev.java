import java.util.HashMap;

public class Hellorev {
    public static void main(String[] args) {

        String str = "hello word";

        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(i, str.charAt(i));
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(map.get(i));
        }
    }
}