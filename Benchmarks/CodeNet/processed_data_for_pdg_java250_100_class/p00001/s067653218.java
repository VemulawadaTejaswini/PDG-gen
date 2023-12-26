public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int datas[] = new int[10];
        for(int i = 0;i < 10;i++){
            datas[i] =  Integer.parseInt(br.readLine());
        }
        Arrays.sort(datas);
        System.out.println(datas[9]);
        System.out.println(datas[8]);
        System.out.println(datas[7]);
    }
}
