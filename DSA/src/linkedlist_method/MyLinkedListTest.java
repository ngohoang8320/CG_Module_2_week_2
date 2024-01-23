package linkedlist_method;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(4);

        linkedList.addFirst(5);
        linkedList.addLast(6);
        linkedList.addLast(10);
        linkedList.addFirst(7);
        linkedList.addLast(9);
        linkedList.printList();
        System.out.println();


        linkedList.add(1, 15);
        linkedList.printList();
        System.out.println();

        linkedList.remove(2);
        linkedList.printList();
        System.out.println();

        MyLinkedList<Integer> linkedList1 = linkedList.clone();
        linkedList1.printList();
        System.out.println();

        System.out.println(linkedList1.contains(15));

        System.out.println(linkedList1.indexOf(10));
        System.out.println(linkedList1.indexOf(90));

        System.out.println(linkedList1.get(4));

        linkedList1.clear();
        linkedList1.printList();
    }
}
