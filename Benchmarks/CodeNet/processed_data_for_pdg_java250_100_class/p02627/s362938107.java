public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] c = str.toCharArray();
        int code = (int)c[0];
        if(code<91){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}
