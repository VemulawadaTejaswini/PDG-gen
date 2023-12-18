public class Main {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        String str =out.nextLine();
        String[] sss=str.split(" ");
        int a= Integer.parseInt(sss[0]);
        int b= Integer.parseInt(sss[1]);
        if(a>b){
            System.out.println("a > b");
        }else if(a<b){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
        }
    }
}
