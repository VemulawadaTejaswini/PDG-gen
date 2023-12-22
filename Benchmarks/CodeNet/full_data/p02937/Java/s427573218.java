import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String[] in1 = br.readLine().split(" ");
    //int N = Integer.parseInt(in1[0]);
    
    String s = br.readLine();
    String t = br.readLine();
    br.close();

    List<Integer>[] posOfAlph = new List[26];
    for(int i = 0; i < 26; i++) posOfAlph[i] = new ArrayList<Integer>();
    int[] cnt = new int[26];
    for(int i = 0; i < 26; i++) cnt[i] = 0;

    int s_size = s.length();
    int t_size = t.length();

    for(int i = 0; i < s_size; i++){
      posOfAlph[s.charAt(i) - 'a'].add(i);
    }

    long per = 0, prv = -1;

    for(int i = 0; i < t_size; i++){
      int t_char_code = t.charAt(i) - 'a';

      if(posOfAlph[t_char_code].isEmpty()){
        per = -1;
        break;
      }

      if(cnt[t_char_code] == posOfAlph[t_char_code].size()){
        per++;
        cnt[t_char_code] = 0;
        prv = -1;
      }

      long now = posOfAlph[t_char_code].get(cnt[t_char_code++]);

      if(prv > now) per++;

      prv = now;
    }

    System.out.println(per == -1 ? -1 : per * (long)s_size + prv + 1L);
  }
}