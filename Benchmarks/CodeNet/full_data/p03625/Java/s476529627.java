import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  ArrayList<Integer>po=new ArrayList<>();
  for(int i=0;i<n;i++)po.add(sc.nextInt());
  Collections.sort(po,new Comparator<Integer>(){
  public int compare(Integer a,Integer b){
  return -a.compareTo(b);
  }
  });
    int x=0;
  while(po.size()>1){
  	if(po.get(0).equals(po.get(1))){
      x=po.get(0);
      po.remove(0);po.remove(0);break;
    }
    else po.remove(0);
  }
  int y=0;
  while(po.size()>1){
  	if(po.get(0).equals(po.get(1))){
      y=po.get(0);
      po.remove(0);po.remove(0);
      break;
    }
    else po.remove(0);
  }
  System.out.println((long)x*y);
}
}