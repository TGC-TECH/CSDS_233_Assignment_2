import  java.util.Queue;
import java.util.LinkedList; //using the linked list implamentation of the queue


public class CustomQStack
{
    private Queue<Integer> que = new LinkedList<>();

    public CustomQStack(){

    }

    public CustomQStack(Queue q){
        que = q;
    }

    public boolean empty() {
        return que.isEmpty();
    }

    public void push(Integer i){
        que.add(i);
    }

    public Integer pop(){
        Integer t = null;
        int y = que.size();
        for(int x = 0; x < y; x++) {
            t = que.poll();
            if(x < y -1){
            que.add(t); }
        }
        if(t==null) { throw new java.util.NoSuchElementException(); //throws an error when the queue is empty
             }

        return t;
    }

    public String toString(){
        return " " +que;
    }




}
