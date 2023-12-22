import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Restrant> rests = new ArrayList<>();
    for(int =0;i<N;i++){
      String town = sc.next();
      int num = sc.nextInt();
      rests[i] = new Restrant(town,num,i+1);
    }
    Arrays.sort(rests);
    for(int i=0;i<N;i++){
      System.out.println(rests[i].i);
    }
  }
}

static class Restrant implements Comparable<Restrant>{
  String town;
  int num;
  int id;
  public Restrant(String town,int num,int id){
    this.town=town;
    this.num=num;
    this.id=id;
  }
  @override
  public int compareTo(Restrant r){
    if(this.town.equals(r.town)){
      return r.num - this.num;
    }else{
      return this.town.compareTo(r.town);
    }
  }
}
