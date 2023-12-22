import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] T=new int[n];
int[] A=new int[n];
long[] temp=new long[n];
long memo=0;
for(int i=0;i<n;i++){
T[i]=Integer.parseInt(sc.next());
A[i]=Integer.parseInt(sc.next());
if(i==0){temp[i]=A[i]+T[i];memo=temp[i];}
if(i>=1){
    if(A[i]!=A[i-1]||T[i]!=T[i-1]){
    if(memo<temp[i]){
        memo=temp[i];
    }else if(memo>temp[i]){
        int j=1;
        while(memo>temp[i]*j){
        j++;
        }memo=temp[i]*j;
    }
    }

}
}
System.out.println(memo);
}
}