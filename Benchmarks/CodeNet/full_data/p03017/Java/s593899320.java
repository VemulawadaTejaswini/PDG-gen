import java.util.*;
public class Main {
    static int n;
    static int a;
    static int b;
    static int c;
    static int d;
    static int p;
    static int q;
    static String s;
    static boolean k = false;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = sc.nextInt();

	s = sc.next();

	p = a;
	q = b;


	

	if(c>d) {
	    while(true) {
		boolean t = false;
		
		while(a != c ) {
		    if(aaa()){
			t  = true;
			if(a>b || s.charAt(a+1)== '.' && b == a+1)continue;
		    }
		    break;		  
		}
		while(b != d) {
		    if(bbb()) 	t = true;		    
		    break;		    
		}
		if(!t) {
		    System.out.println("No");
		    break;
		}
		if(a == c && b == d ){
		    System.out.println("Yes");
		    break;
		}
	    
	    }

	}else {
	    while(true) {
		boolean t = false;
		
		while(b != d ) {
		    if(bbb()){
			t  = true;
			if(b>a || s.charAt(b+1)== '.' && a == b+1)continue;
		    }
		    break;		  
		}
		while(a != c) {
		    if(aaa()) 	t = true;		    
		    break;		    
		}
		if(!t) {
		    System.out.println("No");
		    break;
		}
		if(a == c && b == d ){
		    System.out.println("Yes");
		    break;
		}
	    
	    }
	}
    }

    /*
      if (!k){
      System.out.println("No");
      break;
      }*/
    
	    

    static boolean aaa() {
	k = false;
	if(p<n && a != c) {
	    p = a+1;
	    //System.out.println(p + "p=a+1:"+s.charAt(p-1));
	    if (p != b && s.charAt(p-1) != '#' && p <= n) {
		a = p;
		//System.out.println("a1:"+a);
		k= true;
	    }else {
		if(p<n-1) {
		    p = a + 2;
		    ////System.out.println(p + "p=a+2:"+s.charAt(p-1));
		    if (p != b && s.charAt(p-1) != '#' && p <= n) {
			a = p;
			k= true;
			//System.out.println("a2:"+a);
		    }
		}
	    }
	    //System.out.println("a0:"+a);
	    
	}
	return k;
    }

    static boolean bbb() {
	k = false;
	if(q<n && b != d) {
	    q = b+1;
	    //System.out.println(q + "q=b+1:"+s.charAt(q-1));
	    if (q != a && s.charAt(q-1) != '#' && q <= n) {
		b = q;
		k= true;
		//System.out.println("b1:"+b);	    
	    }else {
		if(q<n-1) {
		    q = b + 2;
		    //System.out.println(q + "q=b+2:"+s.charAt(q-1));
		    if (q != a && s.charAt(q-1) != '#' && q <= n) {
			b = q;
			k= true;
			///System.out.println("b2:"+b);
		    }
		}
	    }
	    //System.out.println("b0:"+b);
	}
	return k;
    }
}	   
