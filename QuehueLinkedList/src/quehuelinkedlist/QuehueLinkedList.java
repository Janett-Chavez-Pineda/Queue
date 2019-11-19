package quehuelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QuehueLinkedList {

    public static void main(String[] args) {
Queue<String> queue = new LinkedList();  

    queue.add("Adrian");
    queue.add("Jesus");
    queue.add("Daniel");
    
    queue.offer("Francisco");
    
    queue.remove();
    
    System.out.println("Se elimino: "+queue.remove());
    
    
    System.out.println("Frente de la cola: "+queue.element());
    
    System.out.println("Se elimino: "+queue.peek());
    
    queue.element();
    queue.peek();
    
    System.out.println(queue.toString());
    }
    
}
