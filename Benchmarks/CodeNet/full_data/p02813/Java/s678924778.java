import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        long[] a = new long[(int)N];
        long[] b = new long[(int)N];
        boolean[] Flg= new boolean[(int)N];
        for(int i=0;i<N;i++) {
            a[i] = sc.nextLong();
        }
        for(int i=0;i<N;i++) {
            b[i] = sc.nextLong();
        }
        int count=0;
        int ans1=0;
        int ans2=0;
        int k=1;
        for(int i=0;i<N;i++) {
    		count=0;
        	for(int j=0;j<a[i];j++) {
        		if(Flg[j]==false) {
        			count++;
        		}
        	}
    		Flg[(int) (a[i]-1)]=true;
    		k=1;
    		for(int l=1;l<N-i;l++) {
    			k=k*l;
    		}
//            System.out.println("i=" + i);
//            System.out.println("count=" + count);
    		ans1=(int) (ans1+k*(count-1));
        	
        }

        boolean[] Flg2= new boolean[(int)N];
        for(int i=0;i<N;i++) {
    		count=0;
    		k=1;
        	for(int j=0;j<b[i];j++) {
        		if(Flg2[j]==false) {
        			count++;
        		}
        	}
    		Flg2[(int) (b[i]-1)]=true;
    		k=1;
    		for(int l=1;l<N-i;l++) {
    			k=k*l;
    		}
    		ans2=(int) (ans2+k*(count-1));
        	
        }
//        System.out.println(Math.abs(ans1));
//        System.out.println(Math.abs(ans2));
        
        System.out.println(Math.abs(ans1-ans2));
    }

}