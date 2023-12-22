    import java.util.Scanner;
    public class Main {
        static long N;
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int n=Integer.parseInt(sc.next());
        	int nextMin=1;
        	int ctn=0;
        	int v;
        	for(int i=0;i<n;i++) {
        		v=Integer.parseInt(sc.next());
        		if(v==nextMin) {
        			nextMin++;
        		}else {
        			ctn++;
        			}
        		}
        		if(nextMin==1) {
        			System.out.println(-1);
        		}else {
        			System.out.println(ctn);
                }
        }
    }