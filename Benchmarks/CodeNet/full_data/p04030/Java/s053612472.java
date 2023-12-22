import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    Stack<String> stack = new Stack<String>();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='0'){
        stack.push("0");}
      if(s.charAt(i)=='1'){
        stack.push("1");}
      if(s.charAt(i)=='B'){
        stack.pop();}}
    String res = "";
    while(!s.isEmpty()){
      res = res + s.pop();}
    System.out.println(res);}}