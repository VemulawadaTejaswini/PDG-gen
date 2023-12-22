import java.util.*;

pblic class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s,t;
	    int j = -1,k = 0,l = 0;
	    s = sc.nextLine();
	    t = sc.nextLine();
	    for(int i = 0;i < t.length();i++)
	    if(s.charAt(0) == t.charAt(i))
	    {
	    j = i;
	    break;
	    }
	    if(j == -1)
	    System.out.println("No");
	    else
	    {
	        for(int i = j;;i++)
	        {
	            if(k == s.length())
	            break;
	            if(i == t.length())
	            i = 0;
	        if(s.charAt(k) == t.charAt(i))
	        l++;
	        k++;
	        }
	        if(l == s.length())
	        System.out.println("Yes");
	        else
	        System.out.println("No");
	    }
	}
}