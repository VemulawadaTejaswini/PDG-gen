							//	package Dynamic;
import java.io.*;
import java.util.*;
class Main{
	static HashMap<LinkedList<Integer>,Integer> h=new HashMap<>();;
    static public void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//       int n=Integer.parseInt(br.readLine());
//       int ar[]=new int[n];
       
        int n=Integer.parseInt(br.readLine());
        LinkedList<Integer> l=new LinkedList<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++)
        	l.add(Integer.parseInt(st.nextToken()));
        System.out.println(f(l));
        
    }
    static int f(LinkedList<Integer> l)
    {
    	//System.out.println(l);
    	int min=Integer.MAX_VALUE;
    	if(l.size()==3)
    	{
    		//System.out.println("aa  "+(l.getFirst()+2*l.get(1)+l.getLast()));
    		return l.getFirst()+2*l.get(1)+l.getLast();
    	}
    	
    	for(int x=0;x<=l.size()-3;x++)
    	{
    		int a=l.get(x);
        	int b=l.get(x+1);
        	int c=l.get(x+2);
    		LinkedList<Integer> li=new LinkedList<>(l.subList(0,x));
    		li.add(a+b);
    		li.add(b+c);
    		li.addAll(l.subList(x+3,l.size()));
//    		System.out.println(li);
    		Integer q=h.get(li);
    		
    		if(q==null)
    		{
    			int val=f(li);
    			min=Math.min(min,val);
    			h.put(li,val);
    		}
    		else
    			Math.min(min,q);
    	}
    	return min;
    }
}
