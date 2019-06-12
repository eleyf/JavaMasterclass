public class FlourPaker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (((bigCount * 5) + smallCount) < goal) {
            return false;
        }

        while (bigCount != 0) {
            if ((goal - 5) >= 0) {
                goal -= 5;
            }
            bigCount--;
        }
        return smallCount >= goal;
    }
}
