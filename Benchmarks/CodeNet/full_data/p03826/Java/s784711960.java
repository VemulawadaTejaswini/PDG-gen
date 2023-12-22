import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int max=0;
    int x=0;
    if(s.length()==n){
    for(int i=0;i<n;++i) {
      if(s.charAt(i)=='I'){
        ++x;
      } else {
        --x;
      }
    }
    if(max<x){
      max=x;
    }
    System.out.println(max);
  }
}
}