package structure;


public class queueWnodes {
    private Node front;
    private Node rear;

    public queue(){
        this.front = null;
        this.rear = null;
    }

    
    public void enqueue(char data){
        Node node = new Node(data);
        if (front == null){
            front = node;
            rear = node;
        }else{
            rear.setNext(node);
            rear = node;
        }
    }
    public void dequeue(){
        if (front == null){
            System.out.println("Queue is empty");
        }else{
            front = front.getNext();
        }
    }

    public int peek(){
        if (front == null){
            System.out.println("Queue is empty");
            return 0;
        }else{
            return front.getData();
        }
    }

    public void display(){
        Node current = front;
        while (current != null){
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    
}
