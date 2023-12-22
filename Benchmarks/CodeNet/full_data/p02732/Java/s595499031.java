import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a=new int[n];
		Map<Integer,Integer> group=new HashMap<>();
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
			Integer x=group.get(a[i]);
			if(x==null){
				group.put(a[i],1);
			}else{
				group.put(a[i],x+1);
			}
		}
      	int all=0;
      	for(Integer key:group.keySet()){
          int v=group.get(key);
          all+=v*(v-1)/2;
        }  
		for(int i=0;i<n;i++){
			System.out.println(all-group.get(a[i])+1);
		}
		
	}
}
