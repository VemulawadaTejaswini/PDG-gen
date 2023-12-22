import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	//入力
        int N = sc.nextInt();
        String S = sc.next();
      	//種類数の最大値入れ物
        int max = 0;
        //区切り位置ごと
        for (int i=1;i<N;i++){
          	//S.substring…文字列Sの0～i番目まで切り出す
            String str1 = S.substring(0,i);
            String str2 = S.substring(i);
            int count = 0;
          	//a~z文字
            boolean[] ar1 = new boolean[26];
            boolean[] ar2 = new boolean[26];
          	//左列
            for (int j=0;j<str1.length();j++){
              	//charAt(j)…j番目の文字を抜き出す
              	//-'a'…「a」はJavaの整数97
                ar1[str1.charAt(j)-'a']=true;
            }
          	//右列
            for (int j=0;j<str2.length();j++){
                ar2[str2.charAt(j)-'a']=true;
            }
          	//両方に同じ文字あるか
            for (int j=0;j<26;j++){
                if (ar1[j]&&ar2[j]){
                  count++;
                }
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}