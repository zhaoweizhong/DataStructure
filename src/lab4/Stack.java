package lab4;

public class Stack {
    private int[] array;//用数组实现
    private int top; //栈顶指针
    private int size;
    public Stack(int n){
        this.size = n;
        array = new int[size];
        top = -1; //栈空的时候
    }
    //压栈
    public void push(int element) {
        if(top == size-1){
            System.out.println("Stack overflow!");
            System.exit(1);
        }
        else
            array[++top] = element;
    }
    //弹栈
    public int pop() {
        if(top == -1){
            System.out.println("Stack empty!");
            System.exit(1);
        }
        return array[top--];
    }
    //判断是否为空
    public boolean isEmpty() {
        return top == -1;
    }
    //返回栈顶元素
    public Integer peek() {
        if(top == -1){
            System.out.println("Stack empty!");
            System.exit(1);
        }
        return array[top];
    }
}
