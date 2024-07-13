import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>(); // based on priority, but not thread safe
        Queue<String> linkedListQueue = new LinkedList<>(); // normal queue with FIFO rule, but not thread safe
        Queue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>(); // based on priority and is thread safe
        System.out.println("..........................");
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(5);
        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        System.out.println("..........................");
        linkedListQueue.add("e");
        linkedListQueue.add("b");
        linkedListQueue.add("d");
        linkedListQueue.add("a");
        while(!linkedListQueue.isEmpty()) {
            System.out.println(linkedListQueue.poll());
        }
        System.out.println("..........................");
        priorityBlockingQueue.add(10);
        priorityBlockingQueue.add(8);
        priorityBlockingQueue.add(9);
        System.out.println(priorityBlockingQueue.poll());

    }
}