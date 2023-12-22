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
    int ma = max(a);
    int k = 0;
    for(int i = 0;i<a.length;i++) {
      if(a[i]==ma) {
        k = i;
        break;
      }
    }
    un(a,clone,k);
    int ma2 = max(clone);
    for(int i = 0;i<a.length;i++) {
      if(i!=k) System.out.println(ma);
      else System.out.println(ma2);
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
