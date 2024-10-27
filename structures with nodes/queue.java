package structure;


public class queue {
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
    
}
