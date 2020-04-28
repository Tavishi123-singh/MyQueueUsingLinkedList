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
}
