import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] T=new int[n];
int[] A=new int[n];
long temp=0;
long memo=0;
for(int i=0;i<n;i++){
T[i]=Integer.parseInt(sc.next());
A[i]=Integer.parseInt(sc.next());}
for(int i=0;i<n;i++){
temp=A[i]+T[i];
if(i==0){memo=temp;}
if(i>=1){
    if(A[i]!=A[i-1]||T[i]!=T[i-1]){
    if(memo<temp){
        if(A[i]>=A[i-1]&&T[i]>=T[i-1]){
            memo=temp;
        }else if(T[i]>T[i-1]&&A[i]<A[i-1]){
            int j=1;
            while(A[i]*j<A[i]&&temp*j<=memo){
                j++;
            }
            memo=temp*j;
        }else if(T[i]<T[i-1]&&A[i]>A[i-1]){
            int j=1;
            while(T[i]*j<T[i]&&temp*j<=memo){
                j++;
            }
            memo=temp*j;
        }
    }else if(memo==temp){
        int j=1;
    while(temp*j<=memo){
        j++;
    }
    memo=temp*j;
    }
    }
}
}
System.out.println(memo);
}
}