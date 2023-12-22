import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int[] a = new int[num];
  	 	for(int i=0; i<num; i++){
            a[i] = sc.nextInt();
        }
        int loop = 1;
        int count = 0;
        while(true){
        	for(int i=0; i<loop; i++){
             if(a[i] > a[loop]) break;
             if(i+1 == loop) count++;
             
        	}
          loop++;
          if(loop >= num) break;
        }
		System.out.println(count+1);
	}
}