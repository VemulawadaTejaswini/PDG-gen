import java.util.*;



public class Main {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        //幅優先探索を仕掛けて相手に近づくように駒を動かしていく
        //駒を動かして相手のマスに隣合ったら残りの自分の領域の駒を数えて勝敗判定
        int n=sc.nextInt();
        int a[]=new int[n];
        int result=114514;
        
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(result>Math.abs(a[i]-a[j]))
                {
                    result=Math.abs(a[i]-a[j]);
                }
            }
        }
        System.out.println(result);
    }


}

