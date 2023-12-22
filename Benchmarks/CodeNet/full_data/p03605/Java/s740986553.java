

public class A {

    public static void main(String[] args) throws IOException {
         java.io.BufferedReader buf = new java.io.BufferedReader( new java.io.InputStreamReader(System.in));
         String input  = buf.readLine();
         if (input.charAt(0) =='9' || input.charAt(1) == '9') {
             System.out.println("Yes"); 
         } else System.out.println("No");
    }

}