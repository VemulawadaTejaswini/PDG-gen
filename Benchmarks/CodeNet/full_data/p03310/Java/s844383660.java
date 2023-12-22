import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int[] A=new int[N+1];
A[0]=0;
int min=0,temp=0;
for(int i=0;i<N;i++){
A[i+1]=Integer.parseInt(sc.next());
}
for(int i=1;i<=N;i++){
A[i]=A[i]+A[i-1];
}
int[] a=new int[4];
for(int i=1;i<N-2;i++){

    for(int j=i+1;j<N-1;j++){
      
    for(int k=j+1;k<N;k++){
        a[0]=A[i];
        a[1]=A[j]-A[i];
        a[2]=A[k]-A[j];
    a[3]=A[N]-A[k];
    Arrays.sort(a);
    temp=a[3]-a[0];
//    System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]);
    if(i==1&&j==2&&k==3)min=temp;
 
   min=Math.min(min,temp);
    }
    }
}
System.out.println(min);

//for(int i=0;i<=N;i++){
//System.out.println(A[i]);
//}
//

}
}