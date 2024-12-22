public class MaxElement2D {
    public static <E extends Comparable<E>> E max(E[][] list) {
        if (list == null || list.length == 0 || list[0].length == 0) {
            return null;
        }

        E max = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(max) > 0) {
                    max = list[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {{1, 9, 3}, {4, 5, 6}, {7, 8, 2}};
        Integer maxNumber = max(numbers);
        System.out.println("Наибольший элемент: " + maxNumber);
    }
}