public class Main{
	public static void main(String args[]){
      Scanner in = new Scanner(System.in) ;
      String str = in.next() ;
      if(str.length()==6&&str.charAt(2)==str.charAt(3)&&str.charAt(4)==str.charAt(5))
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}