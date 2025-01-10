public class Question0026 {
    public int removeDuplicates(int[] nums) {
        int validLength  = 1;
        for (int i = 1; i <nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[validLength] = nums[i];
                validLength++;
            }
        }
        return validLength;
    }
}
