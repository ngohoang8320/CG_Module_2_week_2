package arraylist_method;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        MyList<Integer> myList2;

        myList2 = myList.clone();

        System.out.println(myList.toString());
        System.out.println(myList2.toString());
        System.out.println(myList2.get(1));

//        myList2.clear();
//        System.out.println(myList2.toString());
//        System.out.println(myList.toString());

        System.out.println(myList2.indexOf(4));
        System.out.println(myList2.contains(4));
    }
}
