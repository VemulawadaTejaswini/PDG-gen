import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static String Per(String s) {
		ArrayList<Character> list = new ArrayList<>();
		for (int i=0; i<s.length(); i++) list.add(s.charAt(i));

		int pivotPos = -1;
		char pivot = 0;
		for (int i=list.size()-2; i>=0; i--) {
			if (list.get(i) < list.get(i+1)) {
				pivotPos = i;
				pivot = list.get(i);
				break;
			}
		}

		if (pivotPos==-1 && pivot==0) return "Final";

		int L = pivotPos+1, R = list.size()-1;
		int minPos = -1;
		char min = Character.MAX_VALUE;
		for (int i=R; i>=L; i--) {
			if (pivot < list.get(i)) {
				if (list.get(i) < min) {
					min = list.get(i);
					minPos = i;
				}
			}
		}
		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));

		StringBuilder sb = new StringBuilder();
		for (int i=0; i<list.size(); i++) sb.append(list.get(i));

		return sb.toString();
	}
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        double avg=0;
        String s="";
        int cnt=0;

        for(int i=0;i<N;i++) {
        	s+=String.valueOf(i);
        	x[i] = stdin.nextInt();
        	y[i] = stdin.nextInt();
        }
        while(true) {
        	int j[] = new int[N];
        	for(int i=0;i<s.length();i++) {
        		j[i] = Integer.parseInt(s.substring(i,i+1));
        	}

	        for(int i=0;i<N-1;i++) {
	        	int l;
	        	int o;
	         	for(l=0;;l++){
	         		if(i == j[l]) break;
	         	}
	         	for(o=0;;o++) {
	         		if(i+1 == j[o]) break;
	         	}
	        	avg += Math.sqrt((x[l]-x[o])*(x[l]-x[o])+(y[l]-y[o])*(y[l]-y[o]));
	        }
	        cnt+=1;
	        s = Per(s);
	        if(s.equals("Final"))break;
        }
        System.out.println(avg/cnt);
	}
}
