import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for(int i=0; i<3; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int k = sc.nextInt();
        for(int i =0; i<k; i++ ){
            a[2] *= 2; 
            Arrays.sort(a);
        }
        System.out.println(a[0]+a[1]+a[2]);
    }
}
