import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int num = 0;
    int min = 0;
    ArrayList<Integer> student = new ArrayList<Integer>();
    ArrayList<Integer> point = new ArrayList<Integer>();
    for(int a=0;a<2*N;a++){
      student.add(sc.nextInt());
    }
    for(int b=0;b<2*M;b++){
      point.add(sc.nextInt());
    }
    for(int c=0;c<2*N;c+=2){
      for(int d=0;d<2*M;d+=2){
        if(d==0){
          min = Math.abs(student.get(c)-point.get(d))+Math.abs(student.get(c+1)-point.get(d+1));
          num = d+1;
        }
        if(min>Math.abs(student.get(c)-point.get(d))+Math.abs(student.get(c+1)-point.get(d+1))){
          min = Math.abs(student.get(c)-point.get(d))+Math.abs(student.get(c+1)-point.get(d+1));
          num = d/2+1;
        }
      }
      System.out.println(num);
    }
  }
}