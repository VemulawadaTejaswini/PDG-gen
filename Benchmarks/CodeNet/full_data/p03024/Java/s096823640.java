import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int i = 0;
    int count = 0;
    for(i=0; i< str.length(); i++){
      if(str.charAt(i) == 'x'){
        count++;
      }
    }
    if(count > 7){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}

