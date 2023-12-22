import java.util.*;
class Main 
{ 

	
	 
	public static void main(String args[]) 
	{ 
		Scanner s = new Scanner(System.in);
		char[] c = s.next().toCharArray();
		Stack<Character> stack = new Stack<>();
		int i=0;
		int count=0;
		stack.push(c[0]);
		while(!stack.isEmpty() && i<c.length)
		{
			if((stack.peek()=='0') && c[i]=='1')
			{
				stack.pop();
				count++;
			}
			else if(stack.peek()=='1' && c[i]=='0')
			{
				stack.pop();
				count++;
			}
			else
			{
				stack.push(c[i]);
			}
			i++;
		}

		System.out.println(count*2);

		
		
		
	}
} 
