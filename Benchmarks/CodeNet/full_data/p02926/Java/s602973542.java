import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int  n = sc.nextInt();
    List<Xy> l = new ArrayList<>(n);
    for(int i=0;i<n;i++){
      l.add(new Xy(sc.nextInt(),sc.nextInt()));
    }
//    Collections.sort(l,(s1,s2)->Xy.hencom(s1,s2));
//    for(Xy xy:l){
//      System.out.println(xy);
//    }
    double max=0;
    for(int i=0;i<n;i++){
      int rx=0;
      int ry=0;
      for(int j=0;j<n;j++){
        rx+=l.get(j).x;
        ry+=l.get(j).y;
        max=Math.max(Math.hypot(rx,ry),max);
      }
      Xy r=l.remove(0);
      l.add(r);
    }
    System.out.println(max);
  }
  static class Xy{
    int x;
    int y;
    Xy(int x,int y){
      this.x=x;
      this.y=y;
    }
    public String toString(){
      return "["+x+","+y+"]";
    }
    static int hencom(Xy s1,Xy s2){
      return (int)Math.signum(Math.atan2(s1.y,s1.x)-Math.atan2(s2.y,s1.x));
    }
  }
}
