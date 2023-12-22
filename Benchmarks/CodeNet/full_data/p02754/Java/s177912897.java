import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        long checkNum;
        long blueBall;
        long redBall;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editedInputData = inputData.split(" ");
        checkNum = Integer.parseInt(editedInputData[0]);
        blueBall = Integer.parseInt(editedInputData[1]);
        redBall = Integer.parseInt(editedInputData[2]);

        long blueAndRed = blueBall + redBall;
        long countBall = checkNum % blueAndRed;
        long innerBlueAndRedBallSet = checkNum / blueAndRed;
        
        long totalBlueBall = innerBlueAndRedBallSet * blueBall;

        if (countBall <= blueBall) {
            totalBlueBall += countBall;
        } else {
            totalBlueBall += blueBall;
        }

        System.out.println(totalBlueBall);

    }
}