import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int K=Integer.parseInt(sc.next());
Set<Integer> num = new HashSet<>();
int[] A=new int[N];
for(int i=0;i<N;i++){
A[i]=sc.nextInt();
num.add(A[i]);
}
Arrays.sort(A);
int[] n=new int[num.size()];
int i=0;
while(i<K){
    //種類はn[i]+1
    for(int t=1;t<N;t++){
    if(A[t]==A[t-1]){n[i]++;}else{i++;break;}
    }
}
Arrays.sort(n);
int shurui=num.size();
int ans=0;
for(int ii=0;ii<num.size();ii++){
    if(shurui>K){
shurui-=n[ii];
ans++;
}else{
    System.out.println(ans);break;
    }
}



}
}