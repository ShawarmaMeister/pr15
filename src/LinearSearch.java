public class LinearSearch {
    public static <E> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (key.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        int index = linearSearch(numbers, 3);
        System.out.println("Индекс элемента 3: " + index);
    }
}