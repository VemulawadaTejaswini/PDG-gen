import java.util.stream.*;
import java.util.*;

public class Main{
  public static void main(String[] args){

    List<Integer> order = new ArrayList<Integer>();

    List<Integer> a = new ArrayList<Integer>();
    List<Integer> b = new ArrayList<Integer>();

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i = 0; i < N; i++){
      order.add(i + 1);
    }

    for(int i = 0; i < N; i++){
      a.add(sc.nextInt());
    }

    for(int i = 0; i < N; i++){
      b.add(sc.nextInt());
    }


    Permutation.makePerm(new ArrayList<Integer>(), order, a, b);
    // System.out.println(Permutation.cnt);
    System.out.println(Math.abs(Permutation.aIndex - Permutation.bIndex));
  }
}

class Permutation {

  public static int cnt = 0;
  public static int aIndex = 0;
  public static int bIndex = 0;
  public static void makePerm(List<Integer> perm, List<Integer> ori, List<Integer> a, List<Integer> b){

    List<Integer> incPerm = new ArrayList<Integer>(perm);
    List<Integer> decOri = new ArrayList<Integer>(ori);

    // System.out.println("---- enter method ----");
    // System.out.println("perm count: " + perm.size());
    // System.out.println("perm elements: " + perm);
    // System.out.println("ori count: " + ori.size());
    // System.out.println("ori elements: " + ori);
    if(ori.size() == 0){
      cnt++;
      // System.out.println("perm: " + perm);
      if(a.equals(perm)) aIndex = cnt;
      if(b.equals(perm)) bIndex = cnt;
    }

    for (int i = 0; i < ori.size(); i++){
      // 次の要素を確定する
      Integer nextElement = ori.get(i);
      incPerm.add(nextElement);
      decOri.remove(i);
      makePerm(incPerm, decOri, a, b);
      // System.out.println("current ori: " + ori);
      // 確定していた要素を削除し、元に戻す
      incPerm.remove(incPerm.size() - 1);
      decOri.add(i, nextElement);
    }

    // System.out.println("loop end perm: " + perm);
    // System.out.println("loop end ori: " + ori);
    // System.out.println("---- leave method ----");
  }
}

