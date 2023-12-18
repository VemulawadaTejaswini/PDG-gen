public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] sort = {a,b,c};  
        Arrays.sort(sort);
        System.out.println(sort[0]+" "+sort[1]+" "+sort[2]);
    }
}
