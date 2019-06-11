public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

        int smaller = first;
        int larger = second;

        if(first > second){
            smaller = second;
            larger = first;
        }
        for(int i = smaller; i > 0; i-- ){
            if ((smaller % i == 0) && (larger % i == 0)){
                return i;
            }
        }
        return 0;
    }
}
