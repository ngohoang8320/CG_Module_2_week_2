package linkedlist_method;

public class MyLinkedList<E> {
    private int numNodes;
    private Node head;

    public MyLinkedList(E element) {
        head = new Node(element);
        numNodes++;
    }

    public MyLinkedList() {
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes) {
            addLast(element);
        } else {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            holder = new Node(element);
            holder.next = temp.next;
            temp.next = holder;
        }
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = new Node(element);
        temp.next = newNode;

        numNodes++;
    }

    public E remove(int index) {
        if (index >= numNodes) {
            throw new IndexOutOfBoundsException("Out of bound!");
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node rtn = temp.next;
        temp.next = (temp.next).next;
        numNodes--;
        return rtn.element;
    }

    public boolean remove(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
            if (temp.element.equals(element)) {
                numNodes--;
                return true;
            }
        }
        numNodes--;
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneLinkedList = new MyLinkedList<>(head.element);

        cloneLinkedList.numNodes = 1;
//        cloneLinkedList.head = null;

        for (Node x = head.next; x != null; x = x.next) {
            cloneLinkedList.addLast(x.element);
        }
        return cloneLinkedList;
    }

    public boolean contains(E o) {
        for (Node x = head; x != null; x = x.next) {
            if (x.element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        Node testNode = head;
        for (int i = 0; i < numNodes; i++) {
            if (testNode.element.equals(o)) {
                return i;
            }
            testNode = testNode.next;
        }
        return -1;
    }

    public E get(int i) {
        Node getNode = head;
        if (i < 0 || i >= numNodes)
            throw new IndexOutOfBoundsException("Out of bound!");
        for (int j = 0; j < numNodes; j++) {
            if (j == i) {
                return getNode.element;
            }
            getNode = getNode.next;
        }
        throw new RuntimeException();
    }

    public void printList() {
        if (numNodes == 0)
            System.out.println("Blank!");
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.element + "\t");
            temp = temp.next;
        }
    }

    public void clear() {
        for (Node x = head; x != null; ) {
            Node next = x.next;
            x.element = null;
            x.next = null;
            x = next;
        }
        head = null;
        numNodes = 0;
    }


    private class Node {
        private Node next;
        private E element;

        public Node(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }
    }
}
