import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    if(N < 10){
      System.out.println(N);
      return;
    }
    int[] Wn = {1,3,7,13,21,31,43,57,73,91,111};
  	Integer[] Tn = new Integer[Wn.length];
    Tn[0] = 9;
    for(int i=1; i < Wn.length; i++){
      Tn[i] = (3*(Tn[i-1]-Wn[i-1]) + 2*Wn[i-1]) + Tn[i-1];
    }
    Integer kn = 1;
    for(int i=1; i < Wn.length; i++){
      if(N < Tn[i]){
        kn = i;
        break;
      }
    }
    Long ans = runrun(kn, N-Tn[kn-1]);
    
    System.out.println(ans);
    return;
  }
  public static Long runrun(int kn, int nn){
    int cnt = 0;
    double result = Math.pow(10,kn);
    Long start = (long)result;
    Long end = 100*start;
    for(Long i = start; i < end; i++){
      if(runrunChk(kn, i)){
        cnt++;
      }
      if(cnt==nn){
        return i;
      }
    }
    System.out.println(kn);
    System.out.println(cnt);
    System.out.println(nn);
    return Long.valueOf(10);
  }
  public static boolean runrunChk(int kn, Long runrun){
    if(kn==0){
      return true;
    }
    Long lng = runrun;
    for(int i = 0; i < kn; i++){
      if(lng <= 12){
      	return true;
      }
      Long pnt = lng % 10;
      Long tmp = (Long) (lng-pnt)/10;
      if(pnt==0){
        if(((lng % 100)==0) || ((lng % 100)==10)){
          lng = tmp;
          continue;
        }else{
            return false;
        }
      }
      Long pnt2 = tmp % 10;
      if(((pnt2-pnt)==-1) || ((pnt2-pnt)==0) || ((pnt2-pnt)==1) ){
        lng = tmp;
        continue;
      }else{
          return false;
      }
    }
    return true;
  }
}