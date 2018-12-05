public class Sort {

    public static void selectionSort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int lowerst = nums[i];
            int index = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < lowerst) {
                    lowerst = nums[j];
                    index = j;
                }
            }
        }
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

}