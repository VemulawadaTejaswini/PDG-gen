import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S;
        char[] a;
        int K=0;
        //char小文字:97-122
        S = sc.next();
        a = S.toCharArray();
        K = sc.nextInt();

        for(int i=0;i<a.length;i++){
        	if(K-(123-(int)a[i])>=0){
        		K=K-(123-(int)a[i]);
        		a[i]=97;
        	}
        	if((i==a.length-1)){
        		a[i]=(char) ((int)a[i]+K);
        		if(a[i]==123)a[i]=97;
        	}
        	
        }
        
    for(int i=0;i<a.length;i++){
    	System.out.print(a[i]);
    }
    }
}