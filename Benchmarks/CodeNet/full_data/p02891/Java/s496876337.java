import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      long k = Long.parseLong(sc.next());

      String start = s.substring(0,1);
      String end = s.substring(lng-1,lng);

      long ans = 0;

//if(!(start.equals(end))){
      int onaji = 1;
      long[] onajiN = new long[3];
      int cnt = 0;
///////////////////////////////////////////////
for(int i=1;i<lng;i++){
  if(c[i-1]==c[i]){
    onaji = 1;
    ans++;
    c[i] = '-';
  }
  else{
    onajiN[cnt] = onaji;
    cnt = 2;
    onaji = 1;
  }
}
onajiN[1] = onaji;
//System.out.println("連結なし="+ans);

//k=1の計算完了
if(!(start.equals(end)) || c[lng-1]=='-'){//重ならない場合は独立
  ans *= k;
}
else{//重なる場合
  if(onajiN[0]%2==1 && onajiN[1]%2==1){ //両方奇数
    ans += k-1;
  }
}
///////////////////////////////////////////////
//}

      System.out.println(ans);

    }
}
