import java.util.*;
public class Main{
  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    char[] arr = s.toCharArray();
    int[] vec = new int[2019];
    int[] temp;
    vec[arr[0]-'0']=1;
    int count =0;
    //System.out.println("anuj"+vec[1]);
    for(int i=1;i<s.length();i++){
      temp = new int[2019];
      for(int j=0;j<2019;j++){
        if(vec[j]>0){
          //System.out.println("j "+j);
          int num = (j*10+arr[i]-'0')%2019;
          //System.out.println(num);
          temp[num]=vec[j];
        }
      }
      temp[arr[i]-'0']++;
      vec=temp;
      count+=vec[0];
    }
    System.out.println(count);
  }
}