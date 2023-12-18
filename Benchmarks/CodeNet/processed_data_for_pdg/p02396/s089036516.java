public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=1;
        while(true){
            int a=sc.nextInt();
            if(a==0)break;
            else System.out.println("Case "+j+": "+a);
            j++;
        }
}
}
