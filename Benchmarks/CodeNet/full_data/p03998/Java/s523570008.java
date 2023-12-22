import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] s = new String[3];
    int max = 0;
    int[] cnt = new int[3];
    int next = 0;
    boolean flag = true;

    for(int i = 0; i < 3; i++){
      s[i] = sc.nextLine();
      max = Math.max(max, s[i].length());
    }

    int[][] card = new int[3][max];

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < s[i].length(); j++){
        if(s[i].charAt(j) == 'a'){
          card[i][j] = 0;
        }else if(s[i].charAt(j) == 'b'){
          card[i][j] = 1;
        }else{
          card[i][j] = 2;
        }
      }
    }

    while(flag){
      cnt[next]++;
      //System.out.println("next:" + next + "" + "cnt[" + next + "]:" + cnt[next]);
      //System.out.println("s[" + next + "].length():" + s[next].length());
      if(next == 0 && cnt[next]-1 >= s[next].length()){flag = false; break;}
      if(next == 1 && cnt[next] >= s[next].length()){flag = false; break;}
      if(next == 2 && cnt[next] >= s[next].length()){flag = false; break;}

      next = card[next][cnt[next]];
      //System.out.println("next:" + next);
    }

    if(next == 0){System.out.println('A');}
    if(next == 1){System.out.println('B');}
    if(next == 2){System.out.println('C');}

  }
}
