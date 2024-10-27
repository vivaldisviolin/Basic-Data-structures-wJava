package structure;

public class LinkedList {

    private int size = 0;
    private Node head;



    ///              Add An Element

    public void addelement(Node node,int index){

        if (size == 0){
            head = node;
            size++;
        }else if (size >= 1){
            if (index == 0){
                node.setNext(head);
                head = node;
                size++;
            }else if (index < size-1){
                Node temp = head;
                for (int i = 0; i < index; i++){
                    temp = temp.getNext();
                }
                node.setNext(temp.getNext());
                temp.setNext(node);
                size++;
            }else if (index == size){
                Node temp = head;
                for (int i = 0; i < size -1; i++){
                    temp = temp.getNext();
                }
                temp.setNext(node);
                size++;
            }
        }
        System.out.println(size);
    }
    
    ///              Remove An Element

    public void removeelement(int index){
        if (size == 0){
            System.out.println("There is no element for removing !!!");
        }else if (size == 1){
            head = null;
        }else if (size > 1){
            if (index == 0){
                head = head.getNext();
                size--;
            }else if(index != size -1){
                Node temp = head;
                for (int i = 0; i < index; i++){
                    temp = temp.getNext();
                }
                temp.setNext(temp.getNext().getNext());
                size--;
            }else if(index == size - 1){
                Node temp = head;
                for (int i = 0; i < size - 1; i++){
                    temp = temp.getNext();
                }
                temp.setNext(null);
                size--;
            }
        }
    }

    /// Show The List 

    public void showlist() {
        if (head == null) {
            System.out.println("List is empty !!!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + " ----> ");
                temp = temp.getNext();
            }
            System.out.println("null");
        }
    }

    


}
