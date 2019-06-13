public class LargestPrime {

    public static int getLargestPrime(int number){
        if(number < 0){
            return -1;
        }

        int largestPrime = -1;

        for(int factor = number; factor > 1; factor--){
            if (number % factor == 0){
                System.out.println(factor + " is a factor of " + number);
                for(int i = 2; i <= factor/2; i++){
                    if(factor % i != 0){
                        System.out.println(factor + " is also prime");
                        largestPrime = factor;
                        break;
                    }
                }
            }
        }

        System.out.println("Largest Prime is " + largestPrime);
        return largestPrime;
    }
}
