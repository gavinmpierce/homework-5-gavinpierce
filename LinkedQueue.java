public class LinkedQueue<T> implements Queue<T> {

    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size = 0;

    public LinkedQueue(){
        head = null;
    }

    //O(n) - uh oh
    public void enqueue(T element) {
        if (head == null){
            head = new LinkedNode<T>(element);
        }
        else{
            LinkedNode<T> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new LinkedNode<T>(element);
        }
    }

    //O(1)
    public T dequeue() {
        if (head == null){
            return null;
        }
        else{
            LinkedNode<T> temp = head;
            head = head.next;
            return temp.element;
        }
    }

    //O(1)
    public T peek() {
        return head.element;
    }

    //O(n)
    public int size() {
        int x = 1;
        if (this.isEmpty()){
            return 0;
        }
        else{
            LinkedNode<T> temp = head;
            while (temp.next != null){
                x++;
                temp = temp.next;
            }
            return x;
        }
    }

    //O(1)
    public boolean isEmpty() {
        return head == null;
    }
    
}
