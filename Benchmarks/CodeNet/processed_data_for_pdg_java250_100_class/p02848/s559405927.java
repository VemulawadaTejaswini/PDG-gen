public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c_ans = new char[26];
    for(int i=0; i<26; ++i)
      c_ans[i] = (char)('A'+i);
    char[] c = new char[s.length()];
    for(int i=0; i<s.length(); ++i) {
      c[i] = s.charAt(i);
      int c_num = c[i] - 'A' + n;
      if(c_num > 25) c_num = c_num-26; 
      System.out.print(c_ans[c_num]);
    }
  }
}
