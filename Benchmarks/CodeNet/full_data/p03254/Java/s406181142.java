import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int counter = sc.nextInt();
    int subject = sc.nextInt();
    int[] children = new int[counter];
    for(int i = 0;i<counter;i++){
      children[i] = sc.nextInt();
    }
    Arrays.sort(children);
    int result = 0;
    while(result < counter && subject >= children[result]){
      if(result == counter -1 && subject > children[result]){
        break;
      }
      subject -= children[result];
      result ++;
    }
    System.out.println(result);
  }
}