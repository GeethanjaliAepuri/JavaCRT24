import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
       Stack s=new Stack();
       s.push("A");
       s.push("B");
       s.push("c");
       System.out.println(s);//[A,B,C]
       System.out.println(s.pop());//C
       System.out.println(s.peek());//[A,B]
       System.out.println(s.search("A"));//2
      System.out.println(s.search("Z"));//-1
      System.out.println(s.empty());//false
    }
}
