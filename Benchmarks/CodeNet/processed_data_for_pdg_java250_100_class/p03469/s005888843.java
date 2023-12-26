	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println("2018/01/" + s.substring(8, 10));
            sc.close();
        }
    }
