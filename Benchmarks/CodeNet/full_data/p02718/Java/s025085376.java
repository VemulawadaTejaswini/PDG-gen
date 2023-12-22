import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[N];
      	int sum = 0;
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
          	sum = sum+a[i];
        }
      	Arrays.sort(a);
        boolean anst = true;
        for(int i=(N-1);i>=(N-M);i--){
            if(a[i]<(sum/(4*M))){
                anst = false;
                break;
            }
        }
       if(anst)
           System.out.println("Yes");
        else
            System.out.println("No");
    }
}