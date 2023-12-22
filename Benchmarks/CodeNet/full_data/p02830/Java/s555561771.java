public class HelloWorld{

     public static void main(String []args){
        Scanner s = new Scanner(System. in);
        int N = s.nextInt();
        String S = s.nextLine();
        String Str = S.split(" ");
        if(N==((Str.length)/2)){
        System.out.println(Str);
     }
}
}