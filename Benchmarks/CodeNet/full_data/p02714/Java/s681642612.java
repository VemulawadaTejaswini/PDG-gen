import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        
        long count = 0;		//条件を満たす組はいくつあるか

		for(int i=1; i<(n-1); i++){
		for(int j=i+1; j<n; j++){
		for(int k=j+1; k<(n+1); k++){
		//文字列のijk文字目がすべて異なる文字ならば…
			if((s.charAt(i-1)!=s.charAt(j-1))&&
			   (s.charAt(i-1)!=s.charAt(k-1))&&
			   (s.charAt(j-1)!=s.charAt(k-1))){

				if((j-i)!=(k-j)){
					count++;
				} 
			}
		}}}

		System.out.println(count);
	    scan.close();	
    }
}