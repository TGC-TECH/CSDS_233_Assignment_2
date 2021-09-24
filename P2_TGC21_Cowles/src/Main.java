import  java.util.Queue;
import java.util.LinkedList; //using the linked list implamentation of the queue
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        //testing linked list reverse
        LLreverse mylist = new LLreverse(1); //creates a new "linked list" with one element of value i
        System.out.println(mylist.size());

        for (int i = 2; i < 26; i++) {
            mylist.add(i);
        }
        System.out.println(mylist);
        System.out.println("The 5th element of my list is: " + mylist.get(5));
        mylist.reverse();
        System.out.println(mylist);
        System.out.println("The size of my list is: " + mylist.size());
        System.out.println("The 5th element of my list is: " + mylist.get(5));


        // testing CustomSQueue
        CustomSQueue sq = new CustomSQueue(); //can be made like this, or can be passed an existing stack
        for (int i = 0; i < 25; i++) {
            sq.add(i + 1);
        }

        for (int i = 0; i < 25; i++) {
            System.out.println("Polling from Queue: " + sq.poll());
        }

        //testing CustomQStack by passing existing queue
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            que.add(i + 1);
        }
        System.out.println("This is the queue I am passing: " + que);
        CustomQStack qs2 = new CustomQStack(que);

        for (int i = 0; i < 25; i++) {
            System.out.println("popping from Stack: " + qs2.pop());
            //System.out.println("This is my stack: " + qs2);
        }


        // testing CustomSQueue by passing an existing stack
        Stack<Integer> st1 = new Stack<>();
        for (int i = 0; i < 25; i++) {
            st1.push(i + 1);
        }
        System.out.println("The stack I am passing is: " + st1);
        CustomSQueue sq2 = new CustomSQueue(st1);

        for (int i = 0; i < 25; i++) {
            System.out.println("Polling from Queue: " + sq2.poll());
            System.out.println("This is my Queue: " + sq2);


        }

        //testing CustomQStack

            CustomQStack qs = new CustomQStack(); //can be made like this, or can be passed an existing queue
            for (int i = 0; i < 25; i++) {
                qs.push(i + 1);
            }

            for (int i = 0; i < 25; i++) {
                System.out.println("popping from Stack: " + qs.pop());
                System.out.println("this is my stack: " + qs);

            }


        }


    }

