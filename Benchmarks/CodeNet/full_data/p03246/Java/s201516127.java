

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] KV=new int[100001];
	    int[] GV=new int[100001];
	    int[] V= new int[N];

        for(int i=0; i<N;i++) {
        	int a=gi();
        	V[i]=a;
        	if((i+1)%2==1) {
        		KV[a]++;
        	} else {
        		GV[a]++;
        	}
        }

        int mki=0;
        int mgi=0;
        int mk=0;
        int mg=0;
        for(int i=0; i<100001;i++) {
        	int kv = KV[i];
        	int gv = GV[i];
        	if(mki<kv) {
        		mk=kv;
        		mki=i;
        	}
        	if(mgi<gv) {
        		mg=gv;
        		mgi=i;
        	}
        }

        long ans=0;
        if(mki==mgi) {
        	int mki2=0;
            int mgi2=0;
            int mk2=0;
            int mg2=0;
            for(int i=0; i<100001;i++) {
            	int kv = KV[i];
            	int gv = GV[i];
            	if(mki2<kv && mki!=i) {
            		mk2=kv;
            		mki2=i;
            	}
            	if(mgi2<gv && mgi!=i) {
            		mg2=gv;
            		mgi2=i;
            	}
            }
            if(mk2>mg2) {
            	ans=N-mk2-mg;
            } else {
            	ans=N-mk-mg2;
            }
		} else {
			ans = N-KV[mki] -GV[mgi];
		}


	    System.out.print(ans);
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