public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int i =1;
        while(num>0){
            System.out.println("Case " + i +": " + num);
            i++;
            num =sc.nextInt();
        }
    }
}
