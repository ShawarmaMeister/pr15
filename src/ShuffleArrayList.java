import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Исходный список: " + list);
        shuffle(list);
        System.out.println("Перетасованный список: " + list);
    }
}