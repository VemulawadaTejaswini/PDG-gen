import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      	int k = in.nextInt();
        int n = in.nextInt();
      	int[] ar = new int[n];
        for(int i =0;i<n;i++){
          ar[i] = in.nextInt();
        }
      	if(ar[0]==0&&ar[n-1]==0)	System.out.println(ar[n-2]-ar[1]);
        else if(ar[0]==0)	System.out.println(ar[n-1]-ar[1]);
      	else if(ar[n-1]==0)	System.out.println(ar[n-2]-ar[0]);
      	else	System.out.println(ar[n-1]-ar[0]);
    }
}