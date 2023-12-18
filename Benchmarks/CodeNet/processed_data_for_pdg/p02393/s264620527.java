public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < 3;i++) list.add(sc.nextInt());
        list.sort((o1,o2)->o1-o2);
        System.out.printf("%d %d %d\n",list.get(0),list.get(1),list.get(2));
        sc.close();
    }
}
