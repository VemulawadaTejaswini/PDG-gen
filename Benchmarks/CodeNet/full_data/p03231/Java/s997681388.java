import java.util.*;


public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int  count = sc.nextInt();
        int  count1 = sc.nextInt();
 String  line = sc.nextLine();
 String  line1 = sc.nextLine();
 String  line2 = sc.nextLine();
 String result = "";
 int n = Math.min(count,count1);
StringBuilder sb = new StringBuilder();
  for(int i =0;i<n;i++){
sb.append(line1.charAt(i)).append(line2.charAt(i));
result =sb.toString();
if(line1.charAt(i) == result.charAt(i+1)&&line1.charAt(i) == result.charAt(i+1)){
        line = String.valueOf(result.length());
       
  }
  else {
      line ="-1";
  }

}
  System.out.println(line);
  
         
        
    
        
    }
}