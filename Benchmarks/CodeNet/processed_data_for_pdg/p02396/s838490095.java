public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;;i++){
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            System.out.printf("Case %d: %d\n",i,a);
        } 
          sc.close();
    }
}
