public class SharedDigit {

    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if(firstNum < 10 || firstNum > 99){
            return false;
        }
        if(secondNum < 10 || secondNum > 99){
            return false;
        }

        while(firstNum != 0){
            int firstNumLastDigit = firstNum % 10;
            firstNum /= 10;
            int secondNumLoop = secondNum;
            while (secondNumLoop != 0){
                int secondNumberLastDigit = secondNumLoop % 10;
                secondNumLoop /= 10;
                if (firstNumLastDigit == secondNumberLastDigit){
                    return true;
                }
            }
        }
         return false;
    }
}
