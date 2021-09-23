import java.util.LinkedList;

public class LLreverse {

    // Integer data = null;

    public LinkedList reverse(LinkedList mylist) {

        for (int i = 0; i < mylist.size() / 2; i++) {
            Object temp = mylist.get(i); //stores element
            mylist.set(i, mylist.get(mylist.size() - i - 1));
            mylist.set(mylist.size() - i - 1, temp);
        }
        return (mylist);
    }

}
