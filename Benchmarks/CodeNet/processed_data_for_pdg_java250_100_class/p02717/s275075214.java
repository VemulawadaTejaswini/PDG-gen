public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num_1 = scanner.nextInt();
    int num_2 = scanner.nextInt();
    int num_3 = scanner.nextInt();
    int tmp=0;
    tmp=num_1;
    num_1=num_2;
    num_2=tmp;
    tmp=num_1;
    num_1=num_3;
    num_3=tmp;
    System.out.println(num_1+" "+num_2+" "+num_3);
    }
}
