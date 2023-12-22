import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    ArrayList<Integer> a = new ArrayList<Integer>(n);

    for (int i=0 ; i<n ; i++){
      a.add(sc.nextInt());
    }

    int cnt=0;
    int ans=0;

    for (int i=0 ; i<n ; i++){
      if (i+1==n){break;}
      if(a.get(i)>=a.get(i+1)){
          cnt++;
          ans = (ans<cnt) ? cnt:ans;
      }else{
          ans = (ans<cnt) ? cnt:ans;
          cnt=0;
      }
    }


    System.out.println(ans);
  }
}