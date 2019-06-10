public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum){

        if(!isValid(firstNum) || !isValid(secondNum) || !isValid(thirdNum)){
            return false;
        }

        int firstLastDigit = firstNum % 10;
        int secondLastDigit = secondNum % 10;
        int thirdLastDigit = thirdNum % 10;

        return (firstLastDigit == secondLastDigit ||
                firstLastDigit == thirdLastDigit ||
                secondLastDigit == thirdLastDigit);
    }

    public static boolean isValid(int num){
        return (num >= 10 && num <= 1000);
    }
}
