import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true){
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                sum += input;
                count++;
            } else {
                break;
            }
        }

        if(count > 0){
            avg = Math.round((double) sum/count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
