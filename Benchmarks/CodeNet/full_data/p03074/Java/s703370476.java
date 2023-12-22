
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int N=gi();
        int K=gi();
        String S=gs();
        List<Integer> l=new ArrayList<Integer>();
        long ans=0;
        boolean f=true;
        boolean sf=true;
        if(S.charAt(0)=='0') {
        	f=false;
        	sf=false;
        }
        int tmp=0;
        for (int i=0;i<N;i++) {
            char c=S.charAt(i);
        	if(f) {
        		if(c=='0') {
        			l.add(tmp);
        			tmp=1;
        			f=false;
        		} else {
        			tmp++;
        		}
        	} else {
        		if(c=='1') {
        			l.add(tmp);
        			tmp=1;
        			f=true;
        		} else {
        			tmp++;
        		}
        	}
        }
        l.add(tmp);

        long ta=0;
        if (sf) {
            for (int i=0; i<Math.min(2*K+1, l.size());i++) {
            	ta+=l.get(i);
            }
            ans=ta;
            for (int i=2*K+1; i<l.size();i+=2) {
            	ta+=l.get(i);
            	if(i+1<l.size())ta+=l.get(i+1);
            	ta-=l.get(i-(2*K+1));
            	ta-=l.get(i-(2*K));
            	ans=Math.max(ta, ans);
            }
        } else {
        	for (int i=0; i<Math.min(2*K, l.size());i++) {
            	ta+=l.get(i);
            }
            ans=ta;

            for (int i=2*K; i<l.size();i+=2) {
            	ta+=l.get(i);
            	if(i+1<l.size())ta+=l.get(i+1);
            	if(i-(2*K+1)>=0)ta-=l.get(i-(2*K+1));
            	ta-=l.get(i-(2*K));
            	ans=Math.max(ta, ans);
            }
        }

        System.out.println(ans);
    }

    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}