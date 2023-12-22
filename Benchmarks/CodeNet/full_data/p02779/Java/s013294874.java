import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	
  	int N = sc.nextInt();
	int[] a = new int[N];
  
  	for (int i=0;i<N;i++){
		a[i] = sc.nextInt();
	}
  	Arrays.sort(a);
  	//System.out.println("a:" + Arrays.toString(a));

/*	for(int x=0;x<100000;x++){
      System.out.print(x + " ");
    }
  */
  	for (int j=0;j<N-1;j++){
      	for(int k=j+1;k<N;k++){
          if(a[j] == a[k]){
            	System.out.println("NO");
                //System.out.println("j:"+j+",k:"+k);
            	System.exit(0);
          } 
        }
    }
  	System.out.println("YES");
	}
}