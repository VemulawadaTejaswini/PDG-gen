import java.util.Arrays;

public class Main {
	public static class Task implements Comparable<Task>{
		int index;
		int val;
		public Task(int index,int val) {
			this.index=index;
			this.val=val;
		}
		@Override
		public int compareTo(Task o2) {
			return o2.val - this.val;
		}

	}
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a[] = new int[s.nextInt()+1];
		int b[] = new int[a.length-1];
		for(int i=0;i<a.length;i++) {
			a[i] =s.nextInt();
		}
		Task tsk[] = new Task[b.length];
		for(int i=0;i<b.length;i++) {
			b[i] =s.nextInt();
			tsk[i] = new Task(i,b[i]);
		}
		Arrays.sort(tsk);

		int sum1 =0;
		for(int i=0;i<tsk.length;i++) {
			int index = tsk[i].index;
			if(a[index]<=a[index+1]) {
				sum1 += strike1(a,b,index);
			}else {
				sum1 += strike2(a,b,index);
			}

		}
		System.out.println(sum1);
	}
	public static int strike1(int a[], int b[],int ind) {
		int cap=b[ind];
		if(a[ind]>=cap) {
			a[ind]-=cap;
			return cap;
		}else {
			int res = 0;
			cap-=a[ind];
			res+=a[ind];
			a[ind]=0;
			if(a[ind+1]>=cap) {
				a[ind+1]-=cap;
				return res + cap;
			}else {
				cap=0;
				res += a[ind+1];
				a[ind+1]=0;
				return res;
			}
		}
	}
	public static int strike2(int a[], int b[],int ind) {
		int cap=b[ind];
		if(a[ind+1]>=cap) {
			a[ind+1]-=cap;
			return cap;
		}else {
			int res = 0;
			cap-=a[ind+1];
			res+=a[ind+1];
			a[ind+1]=0;
			if(a[ind]>=cap) {
				a[ind]-=cap;
				return res + cap;
			}else {
				cap=0;
				res += a[ind];
				a[ind]=0;
				return res;
			}
		}
	}
}