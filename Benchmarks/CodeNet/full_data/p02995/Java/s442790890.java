import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	long a =sc.nextLong();
	long b =sc.nextLong();
	long c =sc.nextLong();
	long d =sc.nextLong();
	
	long cd = lcm(c,d);
	//System.out.println(cd);

	long size = b-a+1;

	long b_c = 0L;
	long b_d = 0L;
	long b_cd = 0L;

	for(long i = c; i <= b; i = i + c) {
	    b_c++;
	}


	
	for(long i = d; i <= b; i = i + d) {
	    b_d++;
	}
	for(long i = cd; i <= b; i = i + cd) {
	    b_cd++;
	    //System.out.println(b_cd);
	}


	
	long a_c = 0L;
	long a_d = 0L;
	long a_cd = 0L;

	for(long i = c; i < a; i = i + c) {
	    a_c++;
	}


	
	for(long i = d; i < a; i = i + d) {
	    a_d++;
	}
	for(long i = cd; i < a; i = i + cd) {
	    a_cd++;
	    //System.out.println(a_cd);
	}

					

	/*
	  for (long i = a; i <= b; i++) {
	    
	  if (i % c == 0L) continue;
	     
	  if (i % d == 0L) continue;
	   
	   
	  ans++;
	  }
	*/

	//System.out.println(size  +"-"+( b_c - a_c) +"-" + (b_d - a_d) +"+" +b_cd +" -"+ a_cd);
	System.out.println(size -( b_c - a_c) -(b_d - a_d) +(b_cd - a_cd)); 
	
    }

    static long lcm(long c, long d) {
	long tmp;
	long cc = c;
	long dd = d;
        while ((tmp = c % d) != 0) {
            c = d;
            d = tmp;
        }

	return cc* dd /d;
    }
}
