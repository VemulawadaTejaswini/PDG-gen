import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        if(Math.abs(a[0]-a[2])<Math.abs(a[0]-a[1]))System.out.println("B");
        else System.out.println("A");
    }
}