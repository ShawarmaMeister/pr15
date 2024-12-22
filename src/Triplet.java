public class Triplet<A> {
    private final A first;
    private final A second;
    private final A third;

    public Triplet(A first, A second, A third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public A getSecond() {
        return second;
    }

    public A getThird() {
        return third;
    }

    public boolean contains(A element) {
        return first.equals(element) || second.equals(element) || third.equals(element);
    }

    public A getMin() {
        A min = first;
        if (second instanceof Comparable && ((Comparable) second).compareTo(min) < 0) {
            min = second;
        }
        if (third instanceof Comparable && ((Comparable) third).compareTo(min) < 0) {
            min = third;
        }
        return min;
    }

    public A sum() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            return (A) (Double) (((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue());
        } else {
            return (A) (first.toString() + " " + second.toString() + " " + third.toString());
        }
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public static void main(String[] args) {
        Triplet<Integer> triplet = new Triplet<>(1, 2, 3);
        System.out.println("Содержит 2: " + triplet.contains(2));
        System.out.println("Наименьший элемент: " + triplet.getMin());
        System.out.println("Сумма элементов: " + triplet.sum());
    }
}