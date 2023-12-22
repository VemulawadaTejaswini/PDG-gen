import java.io.*;

public class Kaibun{
  static boolean kaibun(String s){
  boolean result = false;
  int l = s.length();
  int i=0;
  for(i=0; i<(l-1)/2; i++){
      if(s.charAt(i)!=s.charAt(l-i-1)) break;
  }
  if(i==(l-1)/2) result=true;
  return result;
  }
  public static void main(String[] args){
    String str =null;
    try{
  	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    str = reader.readLine();
    }catch(IOException e){
        System.out.println("eo");
    
    }
    int l = str.length();
    String str1=str.substring(0,(l-1)/2);
    String str2=str.substring((l+1)/2,l);

    String strs[] = {str, str1, str2};
    int x;
    for (x=0;x<3;x++){
        if(!kaibun(strs[x])) {
            System.out.println("No");
            break;
        }
        x++;
    }
    if(x==4)System.out.println(x);
  }
}