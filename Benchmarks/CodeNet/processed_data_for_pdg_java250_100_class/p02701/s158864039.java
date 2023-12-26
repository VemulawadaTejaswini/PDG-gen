public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.next();
        }
        HashSet<String> hs = new HashSet<String>();
        for(int i = 0; i < n; i++)
        {
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
