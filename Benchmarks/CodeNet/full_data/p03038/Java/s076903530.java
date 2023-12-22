import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
//    System.out.println(Arrays.toString(a));
    Pair[] ps=new Pair[m];
    for(int i=0;i<m;i++){
      ps[i]=new Pair(sc.nextInt(),sc.nextInt());
    }
    Arrays.sort(ps,(s1,s2)->s2.alte-s1.alte);
//    System.out.println(Arrays.toString(ps));
    int idx=0;
    for(int i=0;i<m;i++){
      while(ps[i].many>0){
        if(idx>=a.length){
          break;
        }
        if(a[idx]>=ps[i].alte){
          break;
        }else{
          a[idx]=ps[i].alte;
          ps[i].many--;
          idx++;
        }
      }
    }
//    System.out.println(Arrays.toString(a));
    long sum=0;
    for(int i=0;i<a.length;i++){
      sum+=a[i];
    }
    System.out.println(sum);
  }
  static class Pair{
    int many;
    int alte;
    Pair(int b,int c){
      many=b;
      alte=c;
    }
    public String toString(){
      return String.valueOf(many)+":"+String.valueOf(alte);
    }
  }
}