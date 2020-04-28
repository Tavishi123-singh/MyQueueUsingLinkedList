/*
 * created by Intellij IDEA
 * User: Tavishi123-singh
 */
package main;

import myqueue.MyQueueUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        MyQueueUsingLinkedList queue=new MyQueueUsingLinkedList();
        queue.enqueue(1000);
        System.out.println(queue.getSize());
        System.out.println(queue.peek().getData() + " element at front");
        queue.enqueue(2000);
        queue.enqueue(3000);
        queue.enqueue(4000);
        System.out.println(queue.dequeue().getData() + " element deleted from queue");
        System.out.println("The size queue is = " + queue.getSize());
        System.out.println(queue.peek().getData());
    }
}
