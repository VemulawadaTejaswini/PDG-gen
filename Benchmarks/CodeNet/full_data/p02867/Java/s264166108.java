
import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       int b[]=new int[n];
       for(int i=0;i<n;i++){
           b[i]=sc.nextInt();
       }

       boolean ans=true;
       int maxa=0;
       int maxb=0;
       for(int i=0;i<n;i++){
        if(maxa<a[i]) maxa=a[i];
        if(maxb<b[i]) maxb=b[i];
       }
       if(maxa>maxb) ans=false;

       

       Arrays.sort(a);
       Arrays.sort(b);

       for(int i=0;i<n;i++){
        if(a[i]>b[i]) ans=false;
       }
       List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		BIT bitC = new BIT(n);
		long test = 0;
		for(int i = 0; i < n; i++) {
			a[i] = Collections.binarySearch(list, a[i]) + 1;
			test += i - bitC.sum(a[i]);
			bitC.add(a[i], 1);
        }
        
        List<Integer> listb = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			listb.add(b[i]);
		}
		Collections.sort(listb);
		BIT bitD = new BIT(n);
		long test2 = 0;
		for(int i = 0; i < n; i++) {
			b[i] = Collections.binarySearch(listb, b[i]) + 1;
			test2 += i - bitD.sum(b[i]);
			bitD.add(b[i], 1);
		}
        if(Math.min(test,test2)>=n-2) ans=false;
        if(ans) System.out.println("Yes");
        else System.out.println("No");

    }
        static class BIT{
            int []bit;
            int n;
            public BIT(int n) {
                this.n = n;
                bit = new int[n + 1];
            }
            int sum(int i) {
                int sum = 0;
                while(i > 0) {
                    sum += bit[i];
                    i -= i & -i;
                }
                return sum;
            }
            void add(int i, int x) {
                while(i <= n) {
                    bit[i] += x;
                    i += i & -i;
                }
            }
    }
}

