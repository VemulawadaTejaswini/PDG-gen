import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

class Main{
  public static void main(String... args)throws IOException{
    Scanner sc = new Scanner(System.in);
    ArrayList<Long> list = new ArrayList<Long>();
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      long l = sc.nextLong();
      int index =list.indexOf(l);
      if(index == -1){
        list.add(l);
      }else{
        list.remove(index);
      }
    }
    System.out.println(list.size());
  }
}
