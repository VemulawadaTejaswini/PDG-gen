import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int count = 0;
  int wcount = 0;
  //ArrayList<String> list = new ArrayList<String>();
  String[] array = new String[4];

  array = sc.next().split("");
  //for(int i=0; i<4; i++){
    //System.out.println(array[i]);
  //}
  ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

  for(int i=0; i<4; i++){
    for(int j=0;j<4; j++){
      if(array[i].equals(array[j])){
        count += 1;
        //System.out.println(count);
      }
    }
    if(count==2){
      wcount += 1;
    }
    count = 0;
  }
  //System.out.println(wcount);
  if(wcount == 4){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }

}
}