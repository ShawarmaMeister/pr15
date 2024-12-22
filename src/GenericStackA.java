import java.util.ArrayList;

public class GenericStackA<E> extends ArrayList<E> {

    public int getSize() {
        return super.size();
    }

    public E peek() {
        return super.get(getSize() - 1);
    }

    public void push(E o) {
        super.add(o);
    }

    public E pop() {
        return super.remove(getSize() - 1);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}