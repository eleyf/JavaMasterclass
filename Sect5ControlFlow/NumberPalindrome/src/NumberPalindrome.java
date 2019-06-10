public class NumberPalindrome {
    public static boolean isPalindrome(int input){
        int number = input;
        int reverse = 0;

        while (number != 0){
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;

            number /= 10;
        }
        return (input == reverse);
    }
}
