import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] a = new int[n];
      int[][] x = new int[n][n];
      int[][] y = new int[n][n];
      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
        for(int j=0;j<a[i];j++){
          x[i][j] = Integer.parseInt(sc.next())-1; //iの人の(j-1)番目の宣言
          y[i][j] = Integer.parseInt(sc.next());
        }
      }

      int[] honest = new int[n];
      String[] honestA = new String[n];
      for(int j=0;j<n;j++){
        honestA[j] = "";
      }

      int ans = 0;

      for(int i=0;i<=n;i++){ //正しい人が  0,1,2,...,n　人の場合
        String s = "";

        for(int j=n;j>=1;j--){
          if(j<=i){
            s += "1";
          }
          else{
            s += "0";
          }
        }

        while(true){ //正しい人の組み合わせ全部
          for(int j=0;j<n;j++){
            honest[j] = s.charAt(j) - 48; //正しければ1
          }

          //確認用
          //System.out.println();
          //System.out.println(s);
          /*
          for(int j=0;j<n;j++){
            System.out.print("honest["+j+"]="+honest[j]+" ");
          }
          System.out.println();
          */
          //

          //発言情報の初期化
          for(int j=0;j<n;j++){
            honestA[j] = "";
          }

          //矛盾がないか検証
          boolean ok = true;
          for(int j=0;j<n;j++){
            if(honest[j]==1){ //jが正しい人という仮定なら
              for(int k=0;k<a[j];k++){ //jの人の発言を全検証
                if(y[j][k]==1){ //奴が正しいなら
                  if(honest[x[j][k]]==0){ //実際には正しくないなら
                    ok = false;
                  }
                }
                if(y[j][k]==0){ //奴が正しくないなら
                  if(honest[x[j][k]]==1){ //実際には正しいなら
                    ok = false;
                  }
                }
              }
            }
          }

          //矛盾がなければ、おｋ
          if(ok){
            ans = Math.max(ans,i);
          }


           //System.out.println(s);
           s = nextPermutation(s);
           if (s.equals("Final")) break;
        } //while 修了

      } //for 正しい人の人数iが終了

      System.out.println(ans);

    }

    public static String nextPermutation (String s) {

       ArrayList<Character> list = new ArrayList<>();
       for(int i=0;i<s.length();i++){
         list.add(s.charAt(i));
       }

       int pivotPos = -1;
       char pivot = 0;
       for(int i=list.size()-2;i>=0;i--){
         if(list.get(i)<list.get(i+1)){
           pivotPos = i;
           pivot = list.get(i);
           break;
         }
       }

        if(pivotPos==-1 && pivot==0){
          return "Final";
        }

        int L = pivotPos+1, R = list.size()-1;
        int minPos = -1;
        char min = Character.MAX_VALUE;
        for(int i=R;i>=L;i--){
          if(pivot<list.get(i)){
            if(list.get(i)<min){
              min = list.get(i);
              minPos = i;
             }
           }
        }

         Collections.swap(list, pivotPos, minPos);
         Collections.sort(list.subList(L, R+1));

         StringBuilder sb = new StringBuilder();
         for(int i=0;i<list.size();i++){
           sb.append(list.get(i));
         }

         return sb.toString();
    }

}
