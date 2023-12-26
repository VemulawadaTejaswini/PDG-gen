public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line = stdReader.readLine()) != null) {
                String[] input = line.split(" ", 0);
                int midtermExam = Integer.parseInt(input[0]);
                int finalExam   = Integer.parseInt(input[1]);
                int additional  = Integer.parseInt(input[2]);
                if(midtermExam == -1 && finalExam == -1 && additional == -1) {
                    break;
                }
                if(midtermExam == -1 || finalExam == -1) {
                    System.out.println("F");
                    continue;
                }
                int addScore = midtermExam + finalExam;
                if(addScore < 30) {
                    System.out.println("F");
                    continue;
                }
                if(addScore >= 30 && addScore < 50) {
                    if(additional >= 50) {
                        System.out.println("C");
                    } else {
                        System.out.println("D");
                    }
                    continue;
                }
                if(addScore >= 50 && addScore < 65) {
                    System.out.println("C");
                    continue;
                }
                if(addScore >= 65 && addScore < 80) {
                    System.out.println("B");
                    continue;
                }
                if(addScore >= 80) {
                    System.out.println("A");
                    continue;
                }
            }
            stdReader.close();
        } catch(Exception e) {
            System.out.println(e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}
