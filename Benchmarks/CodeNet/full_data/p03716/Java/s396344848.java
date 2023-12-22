import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String args[])throws IOException {
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
	
		String a =br.readLine();
		StringTokenizer st =new StringTokenizer(a);
		int arr[] =new int[3*n];
		for(int i =0;i<3*n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		int k =n;long max=Integer.MIN_VALUE;
		
		while(k<=2*n) {
			
			long m =getlarge(arr,k,n)-getsmall(arr,k,n);k++;
			if(max<m)max=m;
		}
		System.out.println(max);
		
	}
	static long getlarge(int arr[] ,int k ,int n) {
		PriorityQueue <Integer> que=new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		long max=0;
		for(int i =0;i<k;i++) {
			que.add(arr[i]);
		}
		for(int i=0;i<n;i++) {
			max+=que.poll();
		}
		
		return max;
		
	}
	static long getsmall(int arr[] ,int k ,int n) {
		PriorityQueue <Integer> que=new PriorityQueue<>();
		long max=0;
		for(int i =k;i<arr.length;i++) {
			que.add(arr[i]);
		}
	
		for(int i=0;i<n;i++) {
			max+=que.poll();
		}
	
		return max;
		
	}
}