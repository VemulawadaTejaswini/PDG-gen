public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
            sum += list.get(i);
        }
        double vote = (double)sum/(4.0*(double)m);
        Collections.sort(list);
        Collections.reverse(list);
        if(list.get(m-1) < Math.ceil(vote)) System.out.println("No");
        else System.out.println("Yes");
    }
}
