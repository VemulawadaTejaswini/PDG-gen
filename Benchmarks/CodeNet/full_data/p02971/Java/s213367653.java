import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> nSeq = new ArrayList<>();
    int n = sc.nextInt();
	for(int i = 0;i < n;i++){
      nSeq.add(sc.nextInt());
    }
    int box = 0;
    for(int i = 0;i < nSeq.size();i++){
      box = nSeq.get(i);
      nSeq.set(i,0);
      System.out.println(Collections.max(nSeq));
      nSeq.set(i,box);
    }
  }
}