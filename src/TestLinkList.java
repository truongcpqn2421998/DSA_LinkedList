public class TestLinkList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList ll = new LinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.addLast(9);
        ll.addLast(24);
        ll.printList();
        ll.getSize();
        System.out.println(ll.getSize());
        System.out.println("number"+ll.remove(3));
        System.out.println("After delete");
        ll.printList();
//        LinkedList newTest=ll.clone();
//        System.out.println("test");
//        newTest.printList();
//        System.out.println("First:" +ll.getFirst());
//        System.out.println("Last:" +ll.getLast());
    }
}
