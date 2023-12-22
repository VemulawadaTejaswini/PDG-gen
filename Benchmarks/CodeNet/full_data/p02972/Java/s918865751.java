import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int total=0;
    for(int i=n-1;i>=0;i--){
        int pal=0;
        for(int j=2*i+2;j<n;j+=i+1){
            pal+=b[j];
        }
        b[i]=(pal+a[i])&1;
        total+=b[i];
    }
    System.out.println(total);
    int j=0;
    for(int i=0;i<total;i++){
        while(b[j]==0){
            j++;
        }
        System.out.print(++j);
        if(j==total-1){
            System.out.println("");
            break;
        }
        System.out.print(" ");
        
    }
  }
}