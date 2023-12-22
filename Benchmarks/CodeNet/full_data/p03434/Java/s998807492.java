import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//入力変数
int N = sc.nextInt();
int a[] = new int[N];
for(int i = 0;i<N;i++){
a[i]=sc.nextInt();
}

//入力値変換
Arrays.sort(a);

//出力変数
int ans=0;

//計算
for(int i = 0;i<N;i++){
ans += Math.pow(-1,i)*a[i];
}

//出力
System.out.println(ans);

}
}
