import java.util.Stack;
public class CustomSQueue {
    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

   public void add(Integer i){
      while(st1.isEmpty() == false){
          //copy st1 to st2
          st2.push(st1.pop());
      }
      st1.push(i); //add item to the bottom of stack

       while(st2.isEmpty() == false){
           //copy st2 back into st1
           st1.push(st2.pop());
       }

   }

   public Integer poll(){
      return st1.pop();
   }


}
