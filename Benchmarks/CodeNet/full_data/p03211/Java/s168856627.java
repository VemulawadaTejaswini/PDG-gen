class Main{
  public static void main(String[] args){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    String[] arr = split(sc.next());
    
    int min = 753;
    for(String tar : arr){
      min = Math.min(min,diff753(tar));
    }
    
    System.out.println(min);
  }
  
  static String[] split(String s){
    String[] res = new String[s.length()-2];
    for(int i = 0 ; i < s.length() - 2; i++){
      res[i] = s.substring(i,i+3);
    }
    return res;
  } 
  
  static int diff753(String str){
    int tar = Integer.valueOf(str);
    return Math.abs(tar - 753);
  }
}