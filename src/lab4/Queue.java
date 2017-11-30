package lab4;

public class Queue {
    private int size;
    private int front;
    private int rear;
    private int[] array;

    public Queue(int size) {
        this.size = size + 1;
        array = new int[size +1];
        front = 0;
        rear = 0;
    }

    public int dequeue() {
        int element = -1;
        if(!isEmpty()) {
            element = array[front];
            front =(front + 1) % size;
            return element;
        } else {
            System.out.println("Empty!");
            return -1;
        }
    }

    public void enqueue(int element){
        if(!isFull()){
            array[rear] = element ;
            rear = (rear + 1) % size;

        } else {
            System.out.println("Full!");
        }
    }

    public boolean isEmpty(){
        boolean b = false;
        if(rear == front)
            b = true;
        return b;
    }

    public boolean isFull(){
        boolean b = false;
        if((rear + 1) % size == front)
            b = true;
        return b;
    }
}