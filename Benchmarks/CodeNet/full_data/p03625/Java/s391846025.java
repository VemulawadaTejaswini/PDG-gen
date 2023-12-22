import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  Map<Integer,Integer>map=new HashMap<>();
  for(int i=0;i<n;i++){
    int po=sc.nextInt();
  if(map.containsKey(po)){
    map.put(po,map.get(po)+1);
  }
    else map.put(po,1);
  }
  ArrayList<Integer>a=new ArrayList<>();
  for(Integer i:map.keySet())a.add(i);
  Collections.sort(a);
  int count=a.size()-1;
  int x=0,y=0;
  while(count!=-1){
    if(map.get(a.get(count)).compareTo(2)>=0){
    x=a.get(count);
      map.put(a.get(count),map.get(a.get(count))-2);
      break;
    }
    else count--;
  }
  while(count!=-1){
    if(map.get(a.get(count)).compareTo(2)>=0){
    y=a.get(count);
      map.put(a.get(count),map.get(a.get(count))-2);
      break;
    }
    else count--;
  }
  System.out.println((long)x*y);
}
}
