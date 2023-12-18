public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        String[] line = tmp.split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int area = a*b;
        int circumference = (a+b)*2;
        System.out.println(area + " " + circumference);
        sc.close();
    }
}
