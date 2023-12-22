import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	public static int convertTo (ArrayList<Integer> a) {
		int result = 0 ; 
		for(int i = a.size()-1; i >= 0 ; i --) {
			result += (int)(a.get(i)*(Math.pow(10,i)));
		}
		return result ;
	} 
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int r = N ;
        int K = Integer.parseInt(a[1]);
        HashSet<Integer> kNumbers = new HashSet<>();
        TreeSet<Integer> nNumbers = new TreeSet<>();
        String[] b = br.readLine().split(" ");
        for(int i = 0 ; i < K ; i ++) {
        	kNumbers.add(Integer.parseInt(b[i]));
        }
        for(int i = 0 ; i <= 9 ; i ++) {
        	if(!kNumbers.contains(i)) {
        		nNumbers.add(i);
        	}
        }
        ArrayList<Integer> number = new ArrayList<Integer>();
        while(N!= 0) {
        	 number.add(N%10);
        	  N/=10;
        }
        
        while(true) {
        	int c = 0 ;
        	for(int i = 0 ; i < number.size() ; i++) {
        		if(kNumbers.contains(number.get(i))) {
        			if(nNumbers.ceiling(number.get(i)) == null) {
        				number.set(i,nNumbers.floor(number.get(i)));
        				System.out.print(number.get(i));
        			}
        			else
        				number.set(i,nNumbers.ceiling(number.get(i)));
        		}
        		else {
        			c++ ;
        		}
        	}
        	if(c == number.size() && convertTo(number) >= r) {
        		System.out.print(convertTo(number));
        		break;
        	}
	}     
	}
}
