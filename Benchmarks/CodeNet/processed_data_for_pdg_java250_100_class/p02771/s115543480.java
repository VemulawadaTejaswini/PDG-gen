public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        sc.close();
        List<Integer> list = Arrays.asList(a,b,c);
        List<Integer> list2 = new ArrayList<Integer>(new HashSet<>(list));
        if(list2.size() == 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
