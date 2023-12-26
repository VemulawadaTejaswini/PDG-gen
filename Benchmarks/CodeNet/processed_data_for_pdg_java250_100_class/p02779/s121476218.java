public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] as = input.readLine().split(" ");
        int a = as.length;
        List<String> list = new ArrayList<String>(Arrays.asList(as));
        List<String> listdel = new ArrayList<String>(new HashSet<>(list));
        int b = listdel.size();
        if(a == b ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
