import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int x[] = new int[n];
    int y[] = new int[n];
    int a[] = new int[n];
    int x1 = 0;
    int x2 = w;
    int y3 = 0;
    int y4 = h;
    for(int i=0 ; i<n ; i++){//入力の受け取り
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      a[i] = sc.nextInt();
    }

    for(int i=0 ; i<n ; i++){
      if(a[i]==1){
        for(int j=0 ; j<n ; j++){
          x1 = Math.max(x1,x[j]);
        }
      }else if(a[i]==2){
        for(int j=0 ; j<n ; j++){
          x2 = Math.min(x2,x[j]);
        }
      }else if(a[i]==3){
        for(int j=0 ; j<n ; j++){
          y3 = Math.max(y3,y[j]);
        }
      }else if(a[i]==4){
        for(int j=0 ; j<n ; j++){
          y4 = Math.min(y4,y[j]);
        }
      }
    }
    // System.out.print(x1+" "+ x2+" "+ y3+" "+y4);
    int d = x2-x1;
    int e = y4-y3;
    int s = d*e;
    if(s<0){
      s = 0;
    }else{
      s = s;
    }
    System.out.println(s);
  }
}
