import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for(int i = 0;i<n;i++) {
      a[i] = stdIn.nextInt();
    }
    int[] clone = new int[n-1];
    for(int i = 0;i<n;i++) {
      un(a,clone,i);
      //for(int j = 0;j<clone.length;j++) {
        //System.out.print(clone[j]);
      //}
      System.out.println(max(clone));
    }
  }
  public static void un(int[] a,int[] clone,int j) {
    int k = 0;
    //System.out.println(j);
    for(int i = 0;i<a.length;i++) {
      if(i!=j)  {clone[k] = a[i];k++;}
    }
    //System.out.println("hei");
      }
  public static int max(int[] a) {
    int b = a[0];
    for(int i = 1;i<a.length;i++) {
      b = Math.max(b,a[i]);
    }
    return b;
  }
}
