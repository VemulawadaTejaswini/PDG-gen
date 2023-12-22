public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> data = new TreeMap<String, Integer>();


        for(int i=0; i<n; i++){
            String town = sc.nextLine();
            int point = sc.nextInt();
            data.put(town+(200-point), i);
        }

        for(String key: data.keySet()){
            System.out.println(data.get(key));
        }

        sc.close();
    }
}