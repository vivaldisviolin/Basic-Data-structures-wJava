public class queueWarray {
        private int maxSize;
        private int[] arr;
        private int front;
        private int rear;
        private int item;
    
        public queue2(int s) {
            maxSize = s;
            arr = new int[maxSize];
            front = 0;
            rear = -1;
            item = 0;
        }
    
        public void insert(int data) {
            if (rear == maxSize - 1) {
                System.out.println("Queue is already full");
            }else{
                arr[++rear] = data;
                item++;
            }
        }
    
        public void remove() {
            if (front == maxSize) {
                front = 0;
            }else{
                front++;
                item--;
            }
        }
    
        public int peekFront() {
            return arr[front];
        }
    
        public boolean isEmpty() {
            return (item == 0);
        }
    
        public boolean isFull() {
            return (item == maxSize);
        }
    
        public int size() {
            return item;
        }
    
        public void display(){
            for (int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
