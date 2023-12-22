import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String source = sc.next();

    char[] type = new char[2];

    type[0] = source.charAt(0);

    int count = 1;
    for (int sceIdx = 1; sceIdx < source.length(); sceIdx++) {
      if (source.charAt(sceIdx) != type[0]) { // 0文字目と違う?
        type[1]=source.charAt(sceIdx);
      }else{
        count++;
      }
    }
    if(count!=2||type[1]=='\0'){
      System.out.println("No");
      return;
    }
    count = 0;
    for (int sceIdx = 1; sceIdx < source.length(); sceIdx++) {
      if (source.charAt(sceIdx) == type[1]) {
        count++;
      }
    }
    if(count != 2){
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
    return;
  }

}