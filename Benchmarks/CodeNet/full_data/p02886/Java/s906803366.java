import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int N = sc.nextInt();
    int po= 0;
    int d[] = new int[100]; 
    int k = 0;
    int j = 0;
    for(int i=0;i<N;i++){
    	d[i] = sc.nextInt();
        //System.out.println(d[i]);
    }
    
    // (N*(N-1))/2 通り存在する
        
    for(k=0;k<(N*(N-1))/2;k++){
    	for(j=0;j<k;j++){
        	po = po+(d[k]*d[j]);
        }
    }
    System.out.println(po);
    }
}