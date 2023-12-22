import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int[] A=new int[N];int[] B=new int[N]; 
for(int i=0;i<N;i++){
A[i]=Integer.parseInt(sc.next());
B[i]=A[i];
}
Arrays.sort(A);
int min=0,temp;

    for(int b=0;b<=(A[0]+A[N-1]+1)/2;b++){
    temp=0;
        for(int i=1;i<=N;i++){
        temp+=Math.abs(B[i-1]-(b+i));
        }
        if(b==0)min=temp;
    if(temp<=min)min=temp;
    }
System.out.println(min);

}
}