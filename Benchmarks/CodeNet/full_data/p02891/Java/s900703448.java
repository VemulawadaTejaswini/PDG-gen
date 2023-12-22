import java.io.*;
class ConnAndDis{
  public static void main()throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int S = br.readLine();
    int T = Integer.parseInt(br.readLine());
    char ch[] = new char[S.length()];
    ch[0] = S.charAt(0);
    for(int i=1;i<S.length()-1;i++){
      if(S.charAt(i-1) == S.charAt(i)){
        ch[i] = '0';
      }else if(S.charAt(i) == S.charAt(i+1)){
        ch[i+1] = '0';
      }else if((S.charAt(i-1) == S.charAt(i))&&(S.charAt(i) == S.charAt(i+1))){
        ch[i] = '0';
      }
    }
    if(s.charAt(0) == s.charAt(S.length()-1)){
      ch[0] = '1';
    }
    int count=0;
    for(int i=0;i<ch.length;i++){
      if(ch[i]=='0'||ch[i]=='1'){
        count++;
      }
    }
    System.out.println(count*T);
    
  }
}