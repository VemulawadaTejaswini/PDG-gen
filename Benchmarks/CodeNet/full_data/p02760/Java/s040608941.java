import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String topInputNumber = scanner.nextLine();
        String centerInputNumber = scanner.nextLine();
        String bottomInputNumber = scanner.nextLine();
        String countInputNumber = scanner.nextLine();
        int count = Integer.parseInt(countInputNumber);
        String[] inputChoiceNumber = new String[count];
        for (int index = 0; index < count; index++) {
            inputChoiceNumber[index] = scanner.nextLine();
        }
        scanner.close();

        String[] editedTopInputNumber = topInputNumber.split(" ");
        String[] editedCenterInputNumber = centerInputNumber.split(" ");
        String[] editedBottomInputNumber = bottomInputNumber.split(" ");
        String[][] inputNumber = {editedTopInputNumber, editedCenterInputNumber, editedBottomInputNumber};

        ArrayList<boolean[]> checkFlagList = new ArrayList<>();

        for (String[] checkRow : inputNumber) {
            boolean[] checkFlag = new boolean[3];
            for (int index = 0; index < checkRow.length; index++) {
                for (String choiceNumber : inputChoiceNumber) {
                    if (choiceNumber.equals(checkRow[index])) {
                        checkFlag[index] = true;
                    }
                }
            }
            checkFlagList.add(checkFlag);
        }

        boolean answer = false;

        if (checkFlagList.get(1)[1]) {
            if (checkFlagList.get(0)[0]) {
                if (checkFlagList.get(2)[2]) {
                    answer = true;
                }
            } else if (checkFlagList.get(0)[2]) {
                if (checkFlagList.get(2)[0]) {
                    answer = true;
                }
            } else if (checkFlagList.get(2)[0]) {
                if (checkFlagList.get(0)[2]) {
                    answer = true;
                }
            } else if (checkFlagList.get(2)[2]) {
                if (checkFlagList.get(0)[0]) {
                    answer = true;
                }
            }
        } else {
            if (checkFlagList.get(0)[0]) {
                if (checkFlagList.get(0)[2]) {
                    if (checkFlagList.get(0)[1]) {
                        answer = true;
                    }
                } else if (checkFlagList.get(2)[0]) {
                    if (checkFlagList.get(1)[0]) {
                        answer = true;
                    }
                }
            } else if (checkFlagList.get(2)[2]) {
                if (checkFlagList.get(0)[2]) {
                    if (checkFlagList.get(1)[2]) {
                        answer = true;
                    }
                } else if (checkFlagList.get(2)[0]) {
                    if (checkFlagList.get(2)[1]) {
                        answer = true;
                    }
                }
            }
        }

        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}