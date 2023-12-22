import java.util.Scanner;

public class Main{

  public static void sort(int[] array, int left, int right){
        if(left <= right){
            int p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l ++;
                }
                while (array[r] > p){
                    r --;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    l++ ;
                    r-- ;
                }
            }
            Main.sort(array, left, r);
            Main.sort(array, l, right);
        }
    }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int m=scanner.nextInt();
    int[] a= new int[n];
    int[] b= new int[m];
    int[] c= new int[m];
    long ans=0;

    for(int i=0;i<n;i++){
      a[i]=scanner.nextInt();
    }

    for(int i=0;i<m;i++){
      b[i]=scanner.nextInt();
      c[i]=scanner.nextInt();
    }

    //Arrays.sort(a);
    Main.sort(a, 0, a.length-1);

    for(int i=0;i<m;i++){
      for(int j=0;j<b[i];j++){
        if(a[j]<c[i]){
          a[j]=c[i];
        }
        else{
          break;
        }
      }
      //Arrays.sort(a);
      Main.sort(a, 0, a.length-1);
    }
    for(int i=0;i<n;i++){
      ans+=a[i];
    }
    System.out.println(ans);
  }
}
