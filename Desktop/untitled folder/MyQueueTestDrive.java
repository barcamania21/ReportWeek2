package MyQueue;

public class MyQueueTestDrive {
    public static void main(String[] args){
        MyQueue<Integer> queue=new MyQueue<Integer>();

        //enqueue 0, 1, 2
        for (int i=0;i<3;i++){
            queue.enqueue(i);
        }

        //dequeue 0,1
        for (int i=0; i<2; i++){
            System.out.println("Dequeued: "+queue.dequeue());
        }

        //enqueue 3, 4
        for (int i=3; i<5; i++){
            queue.enqueue(i);
        }

        //dequeue rest of queue
        System.out.println();
        while (!queue.isEmpty()){
            System.out.println("Dequeued: "+queue.dequeue());
        }
    }
}
