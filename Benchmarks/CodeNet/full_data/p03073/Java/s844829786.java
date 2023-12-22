import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String s = scan.next();
	    scan.close();

	    int max = 0;
	    int cnt = 0;
	    int suffix=0;
	    for(int i=1;i<s.length();i++) {
	    	if(s.charAt(i-1)!=s.charAt(i)) {
	    		cnt++;
	    	}else {
	    		if(max < cnt) {
	    			suffix=i;
	    			max = cnt;
	    		}
	    		cnt=0;
	    	}
	    }
	    cnt=0;
	    char cs[]=s.toCharArray();
	    for(int i=suffix-1;i>=0;i--) {
	    	if(cs[i] == cs[i+1]) {
	    		if(cs[i+1]=='1')cs[i] ='0';
	    		else cs[i]='1';
	    		cnt++;
	    	}
	    }
	    if(suffix==0)suffix=1;
	    for(int i=suffix+max;i<s.length();i++) {
	    	if(cs[i] == cs[i-1]) {
	    		if(cs[i-1]=='1')cs[i] ='0';
	    		else cs[i]='1';
	    		cnt++;
	    	}
	    }

	    System.out.println(cnt);

	}

}