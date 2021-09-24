
public class Main {



    public static void main(String[] args) {
        //testing linked list reverse
        LLreverse mylist = new LLreverse(1); //creates a new linked list with starting value i

        for(int i = 2; i < 26; i++) {
            mylist.add(i); }
            System.out.println(mylist);
            mylist.reverse();
        System.out.println(mylist);




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
