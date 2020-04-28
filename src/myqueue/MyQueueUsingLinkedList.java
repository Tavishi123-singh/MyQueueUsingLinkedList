/*
 * created by Intellij IDEA
 * User: Tavishi123-singh
 */
package myqueue;

import node.Node;

public class MyQueueUsingLinkedList {
    private Node rear;
    private Node front;
    private int size;
    public MyQueueUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty() {
        boolean res = false;
        if (size == 0) {
            res = true;
        }
        return res;
    }
    public void enqueue(int element) {
        Node node = new Node(element);
        if (front == null) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }
    public Node dequeue() {
        Node res = null;
        if (front != null) {
            if (front.getNext() != null) {
                res = new Node(front.getData());
                front = front.getNext();
                size--;
            } else {
                res = new Node(front.getData());
                front = null;
                rear = null;
                size--;
            }
        }
        return res;
    }
}
