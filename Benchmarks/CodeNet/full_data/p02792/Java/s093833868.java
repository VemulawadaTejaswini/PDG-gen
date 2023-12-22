mport java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
      int count=0;
      for(int i=1;i<b;i++){
        for(int k=1;k<(b-(b%2))/2+1;k++){
        if(saijyoui(i)==saikai(k)&&saijyoui(k)==saikai(i)){
          if(i==k){
            count++
          }else{
            count+=2;
          }
        }
      }
      }
      System.out.println(count-1);
	}
  static int syou(int l,int n){
    int amari=l%n;
    return (l-amari)/n;
  }
  static int saijyoui(int n){
    int nyu=n;
    while(nyu>=10){
      nyu=syou(nyu,10);
    }
    return nyu;
  }
  static int saikai(int n){
    return n%10;
  }
}