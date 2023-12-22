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
      int[] monster=new int[length+1];
      for(int i=0;i<length+1;i++){
        monster[i]=Integer.parseInt(arraystr[i]);
      }
      str=br.readLine();
      arraystr = str.split(" ");
      int[] human=new int[length];
      for(int i=0;i<length;i++){
        human[i]=Integer.parseInt(arraystr[i]);
      }
      int ans=check(human,monster);
        System.out.println(ans);

    }catch(IOException e){
      e.printStackTrace();
    }
  }
  public static int check(int[] human,int[] monster){
    int n;
    int count=0;;
    for(int i=human.length-1;i>=0;i--){
      if(monster[i+1]<=human[i]){
      n=monster[i];
        monster[i]-=human[i]-monster[i+1];
        if(monster[i]<0)monster[i]=0;
        count+=n-monster[i]+monster[i+1];
}else{
  count+=human[i];
}
    }
      return count;

  }
}
