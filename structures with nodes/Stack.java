package structure;

public class Stack {
        private int  size;
        private Node head;
        private int top;

        public Stack(int size){
            this.size = size;
            this.head = null;
            this.top = -1;
        }

        public void push(char data){
            Node node = new Node(data);
            if (head == null){
                head = node;
                top++;
            }else if (top < size - 1){
                node.setNext(head);
                head = node;
                top++;
            }else{
                System.out.println("Stack is full !!!");
            }
        }

        public void pop(){
            if (head == null){
                System.out.println("Stack is already empty !!!");
            }else{
                head = head.getNext();
                top--;
            }
        }

        public char peek(){
            if (head == null){
                return ' ';
            }else{
                return head.getData();
            }
        }

        public Boolean isEmpty(){
            return head == null;
        }

        public void show(){
            Node temp = head;
            for(int i = 0;i < top + 1; i++){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
}
