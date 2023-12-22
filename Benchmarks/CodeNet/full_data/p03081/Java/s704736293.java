import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String s = sc.next();
    char[] ch = s.toCharArray();
    char[][] order = new char[Q][2];
    int[] point = new int[N];

    for(int i = 0; i < Q; i++) {
    	char str1 = sc.next().charAt(0);
    	char str2 = sc.next().charAt(0);
    	order[i][0] = str1;
    	order[i][1] = str2;
    }

    for(int i = 0; i < N; i++) {
    	point[i] = 1;
    }


    for(int i = 0; i < Q; i++) {
    	for(int t = 0; t < N; t++) {
    		if(ch[t] == order[i][0]) {
    			if(order[i][1] == 'L') {
    				if(t == 0) {
    					point[t] = 0;
    				}else{

    					point[t-1] = point[t-1] + point[t];
    					point[t] = 0;
    					if(point[t-1] < 0) {
    						point[t-1] = 0;
    					}
    				}
    			}else {
    				if(t == N-1) {
    					point[t] = 0;
    				}else{

    					point[t+1] = point[t+1] + point[t];
    					point[t] = 0;
    					if(point[t+1] < 0) {
    						point[t+1] = 0;
    					}
    				}
    			}
    		}
    	}
    }
    int ans = 0;
    for(int i = 0; i < N; i++) {
    	ans += point[i];
    }
    System.out.println(ans);

  }
}
