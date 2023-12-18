class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputData;
            inputData = reader.readLine();
            String[] strArray = inputData.split(" ");
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<strArray.length;i++){
                list.add(Integer.valueOf(strArray[i]));
            }
            Collections.sort(list);
            System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
