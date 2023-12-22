import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(), l = scan.nextInt();
    int newOne = scan.nextInt();
    int oldOne = 0;
    int index = -1;
    for(int i = 0; i < n-1; i++) {
      oldOne = newOne;
      newOne = scan.nextInt();
      if(oldOne+newOne>=l) {
        index = i;
        break;
      }
    }
    if(index==-1) {
      System.out.println("Impossible");
      return;
    }
    else System.out.println("Possible");
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <=index; i++) {
      sb.append(i);
      sb.append("\n");
    }
    for(int i = n-1; i >= index+2 ; i--) {
      sb.append(i);
      sb.append("\n");
    }
    sb.append(index+1);

    System.out.println(sb.toString());
  }
}
