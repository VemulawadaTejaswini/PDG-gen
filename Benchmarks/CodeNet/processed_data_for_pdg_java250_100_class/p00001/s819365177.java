class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        ArrayList<Integer> input = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10; i++)  input.add(Integer.parseInt(br.readLine()));
        Collections.sort(input, Collections.reverseOrder());
        for(int i=0; i<3; i++) System.out.println(input.get(i));
    }
}
