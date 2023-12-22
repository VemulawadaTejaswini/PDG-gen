import java.util.*;
 
public class Main {
 static HashMap<String,Boolean> jk=new HashMap<String,Boolean>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   String s=sc.next();
	   HashSet<String> h=new HashSet<String>();
	   h.add("dream");
	   h.add("dreamer");
	   h.add("erase");
	   h.add("eraser");
	   boolean k=compute(s,h);
	   if(k)
	   System.out.println("YES");
	   else
	   System.out.println("NO");}
	   
	   public static boolean compute(String s,HashSet<String> h)
	   {
	       if(jk.containsKey(s))
	       return jk.get(s);
	       else{
	       if(s.length()==0)
	       return true;
	       else{
	           boolean gh=false;
	       for(int i=1;i<=s.length();i++)
	       {
	           if(h.contains(s.substring(0,i)))
	           gh=gh||compute(s.substring(i),h);
	       }
	       jk.put(s,gh);
	       return gh;
	       }}
	   }}
	   
	   
	   