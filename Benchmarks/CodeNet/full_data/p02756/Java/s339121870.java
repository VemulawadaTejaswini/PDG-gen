import java.util.Scanner;
class Main {
  public static void(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int q = sc.nextInt();
    String[] t = new String[q];
    
    for(int i = 0; i < q; i++) {
      if(t[i].toCharArray()[0] == '1') {
        String rev = "";
        for(int j = s.length()-1; j >= 0; j--) {
          rev = rev + s.charAt(j);
        }
        s = rev;
      } else {
        char letter = t[i].toCharArray()[4];
        if(t[i].toCharArray()[2] == '1') {
          s = letter + s;
        } else {
          s = s + letter;
        }
      }
    }
    System.out.println(s);  
    
  }
}