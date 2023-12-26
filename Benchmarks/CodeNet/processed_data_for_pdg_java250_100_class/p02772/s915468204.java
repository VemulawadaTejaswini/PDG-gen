public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inputCountData = scanner.nextLine();
        String inputCheckNumberData = scanner.nextLine();
        scanner.close();
        int count = Integer.parseInt(inputCountData);
        boolean checkFlag = true;
        if (count == 1) {
            int checkNumber = Integer.parseInt(inputCheckNumberData);
            if (checkNumber % 2 == 0) {
                if (checkNumber % 3 == 0 || checkNumber % 5 == 0) {
                    checkFlag = true;
                } else {
                    checkFlag = false;
                }
            }
        } else {
            ArrayList<Integer> checkNumberList = new ArrayList<>();
            String[] editedInputCheckNumberData = inputCheckNumberData.split(" ");
            for (int cnt = 0; cnt < editedInputCheckNumberData.length; cnt++) {
                int checkNumber = Integer.parseInt(editedInputCheckNumberData[cnt]);
                checkNumberList.add(checkNumber);
            }
            for (int inputNumber : checkNumberList) {
                if (inputNumber % 2 == 0) {
                    if (inputNumber % 3 == 0 || inputNumber % 5 == 0) {
                        checkFlag = true;
                    } else {
                        checkFlag = false;
                        break;
                    }
                }
            }
        }
        if (checkFlag) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}
