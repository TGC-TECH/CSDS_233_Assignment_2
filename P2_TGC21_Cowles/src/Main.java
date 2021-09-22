
import java.util.LinkedList;

public class Main {

    public LinkedList<Integer> mylist = new LinkedList<Integer>(); //uses integer object

    public static void main(String[] args) {
	// testing CustomSQueue
        CustomSQueue sq = new CustomSQueue();
        for(int i = 0; i < 25; i++){
        sq.add(i+1);}

        for(int i = 0; i < 25; i++){
            System.out.println(sq.poll());}
    //testing CustomQStack
        CustomQStack qs = new CustomQStack();





        System.out.println("This works?");

    }


    public void reverse(){

        for (int i = 0; i < mylist.size() / 2; i++) {
            int temp = mylist.get(i); //stores element
            mylist.set(i, mylist.get(mylist.size() - i - 1));
            mylist.set(mylist.size() - i - 1, temp);
        }
    }
}
