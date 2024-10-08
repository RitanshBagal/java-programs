public class acc3 {
    public static int minSubarray(int nums[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            cs = Math.max(nums[i], nums[i]+cs);
            ms = Math.max(cs, ms);
        }
        return ms;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(minSubarray(nums));
    }
}
