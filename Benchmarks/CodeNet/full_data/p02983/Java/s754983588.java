import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    long L =sc.nextLong();
	    long R = sc.nextLong();
	    int min = Integer.MAX_VALUE;

	    boolean div3=false,div637=false;
	    long idx637=-1;
	    for(int i=0;i<2019;i++) {
	    	long num = L+i;
	    	if(num>R)break;
	    	if(num%673==0) {
	    		idx637=num;
	    		div637=true;
	    		break;
	    	}
	    }
	    if(div637) {
	    	for(int i=0;i<2019;i++) {
		    	long num = L+i;
		    	if(num>R)break;
		    	if(num==idx637)continue;
		    	if(num%3==0) {
		    		div3=true;
		    		break;
		    	}
		    }
	    }
	    if(div3) {
	    	System.out.println(0);
	    }else {
	    	for(int i=0;i<2019;i++) {
		    	long num = L+i;
		    	if(num>R-1) {
		    		break;
		    	}
		    	if(num%2019<min) {
		    		min = (int)(num%2019);
		    	}
		    }
		    int min2 = Integer.MAX_VALUE;
		    for(int i=1;i<2019;i++) {
		    	long num = L+i;
		    	if(num>R)break;
		    	if(num%2019<min2&&num%2019!=min) {
		    		min2 = (int)(num%2019);
		    	}
		    }
		    System.out.println((min*min2)%2019);
	    }
	}



}