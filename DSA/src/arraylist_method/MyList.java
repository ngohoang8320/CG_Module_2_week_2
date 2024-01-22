package arraylist_method;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    int newCapacity = size * 2 + 1;
    private int capacity = DEFAULT_CAPACITY;
    private E[] elements = (E[]) new Object[capacity];

    public MyList() {
    }

    public MyList(int capacity) {
        this.capacity = capacity;
    }

    public void add(int index, E element) {
        ensureCapacity(newCapacity);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;

        size++;
    }

    private void ensureCapacity(int minCapacity) {
        if (size >= elements.length) {
            E[] newElements = (E[]) (new Object[minCapacity]);
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public E remove(int index) {
        checkIndex(index);

        E e = elements[index];

        for (int j = index; j < size - 1; j++) {
            elements[j] = elements[j + 1];
        }

        elements[size - 1] = null;

        size--;
        return e;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + "out of bounds.");
        }
    }

    public MyList<E> clone() {
        MyList<E> o = new MyList<>();
        o.size = this.size;
        o.capacity = this.capacity;
        o.elements = Arrays.copyOf(this.elements, this.size);
        return o;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity(size + 1);  // Increments modCount!!
        elements[size++] = e;
        return true;
    }

    public E get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        if (size > 0) {
            String infor = "[";
            for (int i = 0; i < size; i++) {
                infor += elements[i];
                if (i == size - 1) {
                    infor += "]";
                } else {
                    infor += ", ";
                }
            }
            return infor;
        }
        return "Blank";
    }
}
