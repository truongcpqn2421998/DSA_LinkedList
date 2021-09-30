public class LinkedList<E> {
    private Node head;
    private int numberNodes;
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }
    public LinkedList(E data){
        head =new Node(data);
        numberNodes++;
    }
    public void addFirst(E data){
        Node newNode= new Node(data);
        Node temp=head;
        head=newNode;
        head.next=temp;
        numberNodes++;
    }
    public void addLast(E data){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node holder=new Node(data);
        temp.next=holder;
        numberNodes++;
    }
    public void add(int index,E data){
        Node temp=head;
        for (int i = 0; i < index-1&&temp.next!=null; i++) {
            temp=temp.next;
        }
        Node holder=temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;
        numberNodes++;
    }

    public E remove(int index){
        Node temp=head;
        for (int i = 0; i < index-1&&temp.next!=null; i++) {
            temp=temp.next;
        }
        Node holder=temp.next;
        temp.next=temp.next.next;
        numberNodes--;
        return (E)holder.getData();
    }
    public int getSize(){
        return numberNodes;
    }
    public LinkedList clone(){
        Node temp=head;
        LinkedList<E> newLinked=new LinkedList(temp.getData());
        temp=temp.next;
        while(temp!=null){
            newLinked.addLast((E) temp.getData());
            temp=temp.next;
        }
        return newLinked;
    }
    public boolean contain(E e){
        Node temp=head;
        for (int i = 0; i < numberNodes; i++) {
            if((E)temp.getData()==e){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int indexOf(E o){
        Node temp=head;
        for (int i = 0; i < numberNodes; i++) {
            if((E)temp.getData()==o){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }
    public void clear(){

    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
    public E get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return (E)temp.getData();
    }
    public E getFirst(){
        return (E)head.getData();
    }
    public E getLast(){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        return (E)temp.getData();
    }
}
