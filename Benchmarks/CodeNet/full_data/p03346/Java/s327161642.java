import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        // スペース区切りの整数の入力
        int[] P=new int[N];
        int[] Pn=new int[N];
        for(int i=0;i<N;i++){
            P[i]=sc.nextInt()-1;
            Pn[P[i]]=i;
        }
        int maxSeq=0;
        int seqPoint=-1;
        int seqNum=0;
        for(int i=0;i<N;i++){
            if(seqPoint<Pn[i]){
                seqNum++;
                seqPoint=Pn[i];
            }else{
                if(seqNum>maxSeq){
                    maxSeq=seqNum;
                }
                seqNum=1;
                seqPoint=Pn[i];
            }
        }
        if(seqNum>maxSeq){
            maxSeq=seqNum;
        }
        System.out.println(N-maxSeq);


    }
}