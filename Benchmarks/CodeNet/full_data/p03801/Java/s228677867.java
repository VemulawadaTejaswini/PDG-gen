import java.util.*;
public class Main{
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int a[]=new int[N];
		int result[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		result[0]=a[0];
		for(int i=1;i<N;i++){
			result[i]=0;

			if(a[max(a,i)]<a[i]){
				result[i]=a[i]-a[max(a,i)]+count(a,i+1,a[i]);
				result[0]+=a[max(a,i)]-count(a,i+1,a[i]);
			}else{
				result[0]+=a[i];
			}
		}
		for(int i=0;i<N;i++){
			System.out.println(result[i]);
		}
		
	}
	static int min(int[] value,int limit){
		int min=2000000000;
		int result=-1;
		for(int i=0;i<limit;i++){
			if(min>value[i]){
				result=i;
				min=value[i];
			}
		}
		return result;
	}
	static int count(int[] value,int limit,int a){
		int result=0;
		for(int i=limit;i<value.length;i++){
			if(a<=value[i]){
				result++;
			}
		}
		return result;
	}

	static int max(int[] value,int limit){
		int max=-1;
		int result=-1;
		for(int i=0;i<limit;i++){
			if(max<value[i]){
				result=i;
				max=value[i];
			}
		}
		return result;
	}

}
