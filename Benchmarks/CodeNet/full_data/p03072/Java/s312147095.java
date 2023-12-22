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
        int count2 = 0;
        while(true){
        	for(int i=0; i<loop; i++){
        	 if(a[i] <= a[loop]) count++;
             
        	}
          if(count == loop) count2++;
                    loop++;
          if(loop >= num) break;
          count = 0;
        }
		System.out.println(count2+1);
	}
}