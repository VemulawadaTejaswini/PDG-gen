import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int[] cost=new int[201];
 int[] a=new int[N];
 int temp=0;
for(int i=-100;i<=100;i++){
    temp=0;
    for(int j=0;j<N;j++){
        a[j]=sc.nextInt();
        temp+=Math.pow((a[j]-i),2);
        }
    cost[i+100]=temp;
    }
Arrays.sort(cost);
System.out.println(cost[0]);
}
}