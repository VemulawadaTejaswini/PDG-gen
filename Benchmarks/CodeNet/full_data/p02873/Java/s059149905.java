import java.util.Arrays;
import java.util.Scanner;

class Main
{
  static void do_left(String s, int[] v, int idx){
	while(idx > 0 && s.charAt(idx) == '>'){
      v[idx - 1] = Math.max(v[idx] + 1, v[idx - 1]);
      idx -= 1;
    }
  }

  static void do_right(String s, int[] v, int idx){
    while(idx < s.length() - 2 && s.charAt(idx + 1) == '<'){
      v[idx + 1] = Math.max(v[idx] + 1, v[idx + 1]);
      idx += 1;
    }
  }
  
  public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	String s = ">" + scanner.next() + "<";
    int[] v = new int[s.length() - 1];

    for(int i = 0; i < s.length() - 1; i++){
      if(s.charAt(i) == '>' && s.charAt(i + 1) == '<'){
        do_left(s, v, i);
        do_right(s, v, i);
      }
    }

    //Arrays.stream(v).forEach(x -> System.out.print(x + ","));
    //System.out.println();
	long[] sum = new long[1];
    Arrays.stream(v).forEach(x -> { sum[0] += x; });
    System.out.println(sum[0]);    
  }
}
