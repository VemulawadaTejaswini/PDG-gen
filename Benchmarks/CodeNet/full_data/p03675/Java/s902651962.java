import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class AtCoder {

    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Queue<Long> queue = new LinkedList();
        Stack<Long> stack = new Stack();
        long n,in;
        n=s.nextLong();
        
        for (long i=0;i<n;i++)
        {
            if((n-(i+1))%2==0)
            {
                in = s.nextLong();
                stack.push(in);
            }
            else
            {
                in=s.nextLong();
                queue.add(in);
            }
        }
        System.out.println();
        while(!stack.empty())
        {
            long t = stack.pop();
            System.out.print(t);
        }
        while(!queue.isEmpty())
        {
            long t = queue.remove();
            System.out.print(t);
        }
        
        
        
    }
    
}
