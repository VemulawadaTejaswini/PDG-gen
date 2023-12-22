import java.util.*;
public class Main{
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int K=scanner.nextInt();
    int N=scanner.nextInt();
    int[] A=new int[N];
    String[] pt=new String[N];
    for (int i=0;i<N;i++){
        A[i]=scanner.nextInt();
        if(i>0){
          A[i-1]  =A[i]-A[i-1];
        }
       A[N-1]=K-A[N-1];
        
       
    }
   
   
   
   int lstdist=10000;
    for (int i=0;i<N;i++){
        int lim=0;
        int st=i;
        int str=i-1;
        int lr=0;
        int rl =0;
while (lim<N-1){
st=(st>=N)? st-N:st;
str=(str<0)?str+N:str;
    lr+=A[st];
    rl+=A[str];
    lim++;
    st++;
    str--;
}
int smaller=(rl<lr)?rl:lr;
lstdist=(smaller<lstdist)?smaller:lstdist;

    }
    System.out.println(lstdist);
    
     
  }

}