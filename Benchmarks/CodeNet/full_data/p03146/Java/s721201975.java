import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int s= sc.nextInt();
        int[] f = new int[10000];
        
        f[0] = s;
        
        for(int i=1; i<10000; i++){
            if(f[i-1]%2==0){
                f[i]=f[i-1]/2;
            }else{
                f[i]=3*f[i-1]+1;
            }
            for(int j=0; j<i; j++){
                if(f[i]==f[j]){
                    System.out.println(i+1);
                    return;
                }
            }
        }
        
        
        
	}
}