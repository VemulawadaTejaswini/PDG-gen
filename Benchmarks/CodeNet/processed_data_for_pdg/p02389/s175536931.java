public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line_split = line.split(" ",0);
        int a = Integer.parseInt(line_split[0]);
        int b = Integer.parseInt(line_split[1]);
        int area = a * b;
        int circumference = (a * 2) + (b * 2);
        System.out.println(area+" "+circumference);
    }
}
