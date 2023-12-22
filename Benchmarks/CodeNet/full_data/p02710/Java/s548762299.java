import java.util.*;
class Main{
  static final long mmod = 1000000007;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int node[]=new int[n];
    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    for(int i=0;i<n;i++){
      node[i]=sc.nextInt()-1;
      graph.add(new ArrayList<Integer>());
    }
    for(int i=0;i<n-1;i++){
      int a = sc.nextInt(),b=sc.nextInt();
      graph.get(a-1).add(b-1);
      graph.get(b-1).add(a-1);
    }
    int count[]=new int[n],keika[]=new int[n];
    for(int i=0;i<n;i++){
      search(i,i,-1,graph,node,count,keika,n);
    }
    for(int i=0;i<n;i++){
      pl(count[i]+"");
    }
  }

  public static void search(int moto,int now,int before,ArrayList<ArrayList<Integer>>g,int[]node,int[]count,int[]keika,int n){
    keika[node[now]]++;
    if(moto<=now){
      for(int i=0;i<n;i++){
        if(keika[i]>0){count[i]++;}
      }
    }
    for(int i:g.get(now)){
      if(i!=before){
        search(moto,i,now,g,node,count,keika,n);
      }
    }
    keika[node[now]]--;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
