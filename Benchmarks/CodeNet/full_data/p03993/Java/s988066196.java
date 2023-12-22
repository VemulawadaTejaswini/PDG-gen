import java.util.*;
 
public class Main {
	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		int o= 1 ,p = 1,q = 0, y = 0;


        int s = Integer.parseInt(sc.next())+1;
        int[] test  = new int[100001];
        while(true){
            test[o] = Integer.parseInt(sc.next());
            o++;
            if(s==o)break;
        }
        
        while(true){
            
            y = test[p];
            System.out.print(p+"番目 "+test[y]+"==");
 //           System.out.print(test[p]-1);
            System.out.println(""+p);
            if( test[y] == p ) q++;
            p++;
            if(s==p)break;
        }
        


        System.out.print(q/2);
        System.out.println();
	}
}