import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
      
        int a = sc.nextInt();      
        int b = sc.nextInt();
        
        while(sc.hasNextInt()){
            int hidari = sc.nextInt();
            int migi = sc.nextInt();
            if(a < hidari){
              a = hidari;
            }
            if(migi < b ){
              b = migi; 
            }
        }
        if(b-a+1>0){
            System.out.println(b - a + 1);
        }else{
            System.out.println(0);
        }
	}
}