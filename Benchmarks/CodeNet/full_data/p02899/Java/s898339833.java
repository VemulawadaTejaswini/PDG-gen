import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int A[]=new int[N+1];
        for(int i=1;i<=N;i++)
            A[sc.nextInt()]=i;
        for(int i=1;i<=N;i++)
            System.out.println(A[i]);
    }
}