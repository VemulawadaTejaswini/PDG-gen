import java.util.*;
public class Main{public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  ArrayList<Integer>po=new ArrayList<>();
  for(int i=0;i<n;i++)po.add(sc.nextInt());
  for(int i=0;i<po.size()-1;i++){
  for(int j=i+1;j<po.size();j++){
  if(po.get(i).equals(po.get(j))){po.remove(j);j--;}
  }
  }
  System.out.println(po.size());
}}
