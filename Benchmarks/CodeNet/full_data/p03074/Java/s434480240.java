import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();

    if (N == 1 || N == 2) {
      System.out.println("1");
      return;
    }

    int result;
    int[] conNum = new int[N];
    char first = S.charAt(0);
    boolean equalFirst = true;
    int cnsub = 0;
    int tmp = 0;
    for (int i = 0; i < N-1; i++) {
      if (equalFirst) {
        if(S.charAt(i) == first) {
          tmp++;
        } else {
          conNum[cnsub] = tmp;
          cnsub++;
          tmp = 1;
          equalFirst = false;
        }
      } else {
        if(S.charAt(i) != first) {
          tmp++;
        } else {
          conNum[cnsub] = tmp;
          cnsub++;
          tmp = 1;
          equalFirst = true;
        }
      }
    }
    if (S.charAt(N-1) == S.charAt(N-2)) {
      conNum[cnsub] = tmp+1;
      cnsub++;
    } else {
      conNum[cnsub] = tmp;
      conNum[cnsub+1] = 1;
      cnsub += 2;
    }

    int tmptmp;
    if (first == '1')
      tmptmp = cnsub / 2;
    else
      tmptmp = (cnsub+1) / 2;
    K = Math.min(K,tmptmp);



    //この時点でcnsubは配列conNumの要素数を表す
    int[] trans = new int[cnsub - (2*K)];
    for (int i = 0; i < cnsub - (2*K); i++) {
      trans[i] = 0;
    }
    if (first == '1') {
      for (int i = 0; i < cnsub - (2*K); i += 2) {
        for (int j = 0; j < 2*K + 1; j++) {
          trans[i] += conNum[i+j];
        }
      }
      int maxnum = 0;
      int maxsub = 0;
      for (int i = 0; i < cnsub - (2*K); i++) {
        if (trans[i] > maxnum) {
          maxnum = trans[i];
          maxsub = i;
        }
      }
      result = maxnum;
    } else {
      int firstNum = 0;
      for (int i = 0; i < 2*K; i++) {
        firstNum += conNum[i];
      }
      for (int i = 1; i < cnsub - (2*K); i += 2) {
        for (int j = 0; j < 2*K + 1; j++) {
          trans[i] += conNum[i+j];
        }
      }
      int maxnum = 0;
      int maxsub = 0;
      for (int i = 0; i < cnsub - (2*K); i++) {
        if (trans[i] > maxnum) {
          maxnum = trans[i];
          maxsub = i;
        }
      }
      result = Math.max(maxnum,firstNum);
    }

    System.out.println(result);
  }
}
