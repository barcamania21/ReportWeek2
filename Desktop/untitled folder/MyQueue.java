package MyQueue;

import java.util.Stack;

public class MyQueue<E> {
    private Stack<E> stack1;
    private Stack<E> stack2;
    private int size;

    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(E element){
        stack1.push(element);
        size++;
    }
    public E dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                return null;
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        size--;
        return stack2.pop();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E front(){
        return stack2.peek();
    }


}
