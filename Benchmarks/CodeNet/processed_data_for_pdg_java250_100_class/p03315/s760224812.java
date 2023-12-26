public class Main{
        static final Scanner sc=new Scanner(System.in);
        static String S=sc.next();
        public static void main(String[]args){
                int x=0;
                for(int i=0;i<4;i++){
                        if(S.charAt(i)=='+'){
                                x++;
                        }else{
                                x--;
                        }
                }
                System.out.println(x);
        }
}
