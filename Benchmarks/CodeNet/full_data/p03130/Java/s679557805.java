import java.util.*;

public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[6];
    int cnt1 = 0;
    int cnt2 = 0;
    int cnt3 = 0;
    int cnt4 = 0;
    
    for(int i=0; i<6; i++){
      a[i]=sc.nextInt();
      if(a[i]==1)cnt1++;
      if(a[i]==2)cnt2++;
      if(a[i]==3)cnt3++;
      if(a[i]==4)cnt4++;
    }
    if(cnt1==0 || cnt2==0 || cnt3==0 || cnt4==0){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}