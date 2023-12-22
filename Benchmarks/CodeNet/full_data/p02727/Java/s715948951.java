import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int  x=scn.nextInt();
		int y=scn.nextInt();
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int []arr =new int[a];
		int [] arr1=new int[b];
           int [] arr2=new int[c];
           for(int i=0;i<a;i++){
        	   arr[i]=scn.nextInt();
           }
          for(int i=0;i<b;i++){
        	  arr1[i]=scn.nextInt();
          }
          for(int i=0;i<c;i++){
        	  arr2[i]=scn.nextInt();
        	  
          }
          Arrays.sort(arr);
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          
         
         res(arr,arr1 ,arr2 ,x, y);
	}
	public static void res(int [] arr1,int [] arr2 ,int [] arr3,int x,int y){
		PriorityQueue<Integer> pq =new PriorityQueue<>();
		int count=0;
		for(int i=arr1.length-1;i>=0&&(arr1.length-1-i)<x;i--){
			pq.add(arr1[i]);
			count++;
			
		}
		for(int i=arr2.length-1;i>=0&&(arr2.length-1-i)<y;i--){
			pq.add(arr2[i]);
			count++;
			
		}
		int idx=arr3.length;
		if(count<(x+y)){
			for(int i=arr3.length-1;i>=0&&count<(x+y);i--){
				pq.add(arr3[i]);
				count++;
				idx=i;
			}
		}
		idx--;
		for(int i=idx;i>=0;i--){
			if(pq.peek()>=arr3[idx]){
				break;
			}
			pq.remove();
			pq.add(arr3[idx]);
			
		}
		long ans=0;
		while(pq.size()>0){
			ans+=pq.remove();
		}
		System.out.println(ans);
		
		
	}

}