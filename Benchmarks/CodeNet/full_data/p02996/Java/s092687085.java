import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  N = sc.nextInt();
     int[] a=new int[N];
     int[] b=new int[N];
     int time=0,task=0;
     boolean flag=true;
     for(int i=0;i<N;i++){
       a[i] = sc.nextInt();
       b[i] = sc.nextInt();
     }
      Data[] d = new Data[N];
        for(int i= 0; i < N; i++) {
            d[i] = new Data(a[i], b[i]);
        }
        Arrays.sort(d, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d1.getB() - d2.getB();
            }
        });
      for(int i=0;i<N;i++){
        time+=d[i].getA();
        task=d[i].getB();
        if(time>task){
          System.out.println("No");
          flag=false;
        }
      }
      if(flag){
        System.out.println("Yes");
      }
   }

}
class Data{
  private int a;
  private int b;
  public  Data(int a, int b) {
    this.a = a;
    this.b = b;
  }
  public int getA() {
    return a;
  }
  public int getB() {
    return b;
  }
}
