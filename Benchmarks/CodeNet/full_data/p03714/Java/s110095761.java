import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[3*n];
		for(int i= 0;i < 3*n;i++){
			a[i] = sc.nextInt();
		}

		long sum1[] = new long[n+1];
		PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>();
		long xsum = 0;
		for(int i = 0;i < n;i++){
			queue1.add(a[i]);
			xsum += a[i];
		}
		sum1[0] = xsum;

		for(int i = n;i < 2*n;i++){
			queue1.add(a[i]);
			sum1[i-n+1] = a[i] + sum1[i-n];

			int del = queue1.poll();						//最小要素の削除
			sum1[i-n+1] -= del;

//			System.out.println("sum1 " + sum1[i-n+1]);
		}


		long sum2[] = new long[n+1];
		PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>(new MyComparator());
		long ysum = 0;
		for(int i = 3*n-1;i >= 2*n;i--){
			queue2.add(a[i]);
			ysum += a[i];
		}
		sum2[0] = ysum;
		int c = 1;
		for(int i = 2*n-1;i >= n;i--){
			queue2.add(a[i]);
			sum2[c] = a[i] + sum2[c-1];

			int del = queue2.poll();						//最小要素の削除
			sum2[c] -= del;
//			System.out.println("del " + del);
//
//			System.out.println("sum2 " + sum2[c]);

			c++;

		}
//		System.out.println();

		long ans = -1000000000;
		for(int i= 0;i < n;i++){
//			
//			System.out.println("sum1 "+sum1[i]);
//			System.out.println("sum2 "+sum2[n-i]);
//
//			System.out.println(ans);

			ans = Math.max(ans, sum1[i] - sum2[n-i]);
		}
		System.out.println(ans);


	}

}

class MyComparator implements Comparator {
	 
    public int compare(Object obj1, Object obj2) {
         
        int num1 = (int)obj1;
        int num2 = (int)obj2;
         
        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}


