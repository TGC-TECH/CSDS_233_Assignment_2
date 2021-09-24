import java.util.Stack;

public class CustomSQueue {
    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();


    public CustomSQueue(){

    }

    public CustomSQueue(Stack s1){
        st1 = s1;

        //st2 =s2;
    }



   public void add(Integer i){
     st1.push(i);

   }

   public Integer poll(){
        Integer toreturn;
       while(st1.isEmpty() == false){
           //copy st1 to st2
           st2.push(st1.pop());
           //length++;
       }
       toreturn = st2.pop(); //add item to the bottom of stack

       while(st2.isEmpty() == false){
           //copy st2 back into st1
           st1.push(st2.pop());
       }

        return toreturn;
   }

   public String toString() {
        return " " + st1;
    }

}
