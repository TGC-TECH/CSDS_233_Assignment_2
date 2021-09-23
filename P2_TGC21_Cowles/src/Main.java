
import java.util.LinkedList;

public class Main {



    public static void main(String[] args) {
        //testing linked list reverse
        LLreverse lstrev = new LLreverse();
        LinkedList<Integer> testlist = new LinkedList<Integer>(); //uses integer object

        System.out.println(lstrev.reverse(testlist));



	// testing CustomSQueue
        CustomSQueue sq = new CustomSQueue();
        for(int i = 0; i < 25; i++){
        sq.add(i+1);}

        for(int i = 0; i < 25; i++){
            System.out.println("Polling from Queue: " + sq.poll());}

    //testing CustomQStack

        CustomQStack qs = new CustomQStack();
        for(int i = 0; i < 25; i++){
            qs.push(i+1);}

        for(int i = 0; i < 25; i++){
            System.out.println("popping from Stack: " + qs.pop());}





        System.out.println("This works?");

    }


    }
