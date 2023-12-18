public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int i;
        int answer=1;
        for(i=0;i<3;i++){
            answer*=x;
        }
        System.out.println(answer);
    }
}
