public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfday){
        if (hourOfday >= 0 && hourOfday <= 23){
            if (hourOfday < 8 || hourOfday > 22){
                if (barking){
                    return true;
                }
            }
        }
        return false;
    }
}
