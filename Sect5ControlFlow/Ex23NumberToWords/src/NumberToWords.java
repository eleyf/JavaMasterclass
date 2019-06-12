public class NumberToWords {

    public static void numberToWords(int number){

        if(number < 0){
            System.out.println("Invalid Value");
        } else if(number == 0) {
            System.out.println("Zero");
        } else {

            int reverseNumber = reverse(number);
            int numberDigitCount = getDigitCount(number);
            int reverseNumberDigitCount = getDigitCount(reverseNumber);

            while (reverseNumber != 0){
                int lastDigit = reverseNumber % 10;

                switch (lastDigit){

                    case 0:
                        System.out.println("Zero");
                        break;

                    case 1:
                        System.out.println("One");
                        break;

                    case 2:
                        System.out.println("Two");
                        break;

                    case 3:
                        System.out.println("Three");
                        break;

                    case 4:
                        System.out.println("Four");
                        break;

                    case 5:
                        System.out.println("Five");
                        break;

                    case 6:
                        System.out.println("Six");
                        break;

                    case 7:
                        System.out.println("Seven");
                        break;

                    case 8:
                        System.out.println("Eight");
                        break;

                    case 9:
                        System.out.println("Nine");
                        break;

                    default:
                        System.out.println("Invalid");
                        break;

                }

                reverseNumber /= 10;
            }

            if(numberDigitCount > reverseNumber){
                int additionalZeroCount = numberDigitCount - reverseNumberDigitCount;
                for(int i = 0; i < additionalZeroCount; i++){
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number){

        int reverseNum = 0;

        while (number != 0){

            int lastDigit = number % 10;
            number /= 10;
            reverseNum *= 10;
            reverseNum += lastDigit;

        }
        return reverseNum;
    }

    public static int getDigitCount(int number){

        if(number < 0){
            return -1;
        }

        if(number == 0){
            return 1;
        }

        int count = 0;
        while (number != 0){
            count++;
            number /= 10;
        }

        return count;
    }
}
