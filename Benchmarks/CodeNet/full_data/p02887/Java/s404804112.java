import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String Stmp = sc.nextLine();
        String S[] = new String[N];
        for(int i=0; i<N; i++){
            S[i] = Stmp.substring(i,i+1);
        }

        int counter=1;
        for(int i=0; i<N-1; i++){
            //System.out.println("i="+i+" compare "+S[i]+" and "+S[i+1]);
            if(S[i].equals(S[i+1])){
                //System.out.println("------"+S[i]+" and "+S[i+1]+" are same so merge & counter:"+counter);
            }else{
                counter++;
                //System.out.println("------Different so increment: "+counter);
            }
        }
        System.out.println(counter);
    }
}
// ・for：N体のスライムを順番に見ていく
// 　・i番目の色をtempに記録
// 　if：(i+1)番目の色と比較して同色なら
// 　　→counterが増えない
// 　　　→次のループに移る
// 　else：(i+1)番目の色と比較して別色なら
// 　　→counterをインクリメント
// 　　　→次のループに移る