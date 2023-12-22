import java.io.*;
import java.util.ArrayList;
//password:53VHEnd4
public class Main{
  public static void main(String args[]){
    String str;
    try{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
      str=br.readLine();
      int length=Integer.parseInt(str);
            str=br.readLine();
      String[] arraystr = str.split(" ");
      int[] num=new int[length];
      for(int i=0;i<length;i++){
        num[i]=Integer.parseInt(arraystr[i]);
      }
      int ans=check(num);
      if(ans==0){
        System.out.println("NO");
      }else{
      System.out.println("YES");
    }
    }catch(IOException e){
      e.printStackTrace();
    }
  }
public static int check(int[] num){
  int p=0;
  for(int i=1;i<num.length;i++){
    if(num[i-1]!=i){
      p+=1;
    }
  }
  if(p>2){
    return 0;
  }else{
  return 1;
}
}


}
