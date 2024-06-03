import java.util.LinkedList;

public class Queue extends LinkList {
    private Node front;
    private Node rear;
    ////default constructor
    public Queue() {
    }
    //insert at back
    public void enqueue(Object data) {
        insertAtBack(data);
    }
    //remove from front
    public Object dequeue() {
        return removeFromFront();
    }
    //getter
    public Object getFront() {
        return getFirst();
    }
    public Object getEnd() {
        return removeFromBack();
    }
    public int size() {
        return countNodes();
    }
}