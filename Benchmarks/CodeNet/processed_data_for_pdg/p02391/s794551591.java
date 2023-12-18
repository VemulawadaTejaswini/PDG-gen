public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String relation;
        if (a > b){
            relation = ">";
        }else if( a < b ){
            relation = "<";
        }else{
            relation = "==";
        }
        System.out.printf("a %s b\n", relation);
    }
    public static void main(String[] args){
        new Main();
    }
}
