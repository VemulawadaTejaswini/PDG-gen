public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int time, hour, minute, second;
    time = sc.nextInt();    
    hour = time / 3600;
    minute = (time % 3600) / 60;
    second = (time % 3600) % 60 ;
    System.out.println(hour + ":" + minute + ":" + second);
    }
}
