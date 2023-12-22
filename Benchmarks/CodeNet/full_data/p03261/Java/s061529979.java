import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner scan =new Scanner(System.in);
    int n = scan.nextInt();
   	String[] str = new String[n];
    ArrayList<String> st = new ArrayList<String>();
      for(int i = 0 ; i<n ; i++){
      str[i] = scan.next();
      
    }
    
    int count = 0 ;
    for(int i = 0 ; i<n-1 ; i++){
      if(st.contains(str[i])){
        count++;
        break;
      }else{
        st.add(str[i]);
      }
      if(str[i].charAt(str[i].length()-1) != str[i+1].charAt(0)){
        count++;
        break;
      } 
    }
    if(count!=0){
      System.out.println("No");
    }else{
      
      System.out.println("Yes");
    }
  }
}
