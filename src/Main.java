import com.queue.Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.add(1);
        queue.add(2);
        queue.printElements();
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
