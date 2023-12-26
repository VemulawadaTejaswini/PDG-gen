public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int length = s.length();
      char [] c = s.toCharArray();
      for(int i =0; i<length; i++){
        if(i%2!=0){
          if(c[i]=='R'){
            System.out.println("No");
            return;
          }
        }    
        else if(i%2==0){
           if(c[i]=='L'){
            System.out.println("No");
            return;
          }
        }
      }
      System.out.println("Yes");
    }
}
