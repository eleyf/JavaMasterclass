public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        int bucketsNeeded = 0;
        double area = width * height;
        double extraBucketsArea = areaPerBucket * extraBuckets;
        area -= extraBucketsArea;

        if(area > 0){
            bucketsNeeded = (int) Math.ceil (area / areaPerBucket);
        }

        return bucketsNeeded;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        int bucketsNeeded = 0;
        double area = width * height;

        bucketsNeeded = (int) Math.ceil (area / areaPerBucket);

        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        int bucketsNeeded = 0;

        bucketsNeeded = (int) Math.ceil (area / areaPerBucket);

        return bucketsNeeded;
    }
}
