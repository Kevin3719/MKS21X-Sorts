public class Sort{
  public static boolean check(int nums[]) {
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < nums[i - 1]) {
        return false;
      }
    }
    return true;
  }
  public static void mysort(int nums[]) {
    for (int i = 0; i < nums.length; i ++) {
      int lowestest = nums[i];
      int index = 0;
      int j = i;
      for (j = i; j < nums.length; j++) {
        if (nums[j] < nums[j - 1]) {
          lowestest = nums[j];
          index = j;
        }
    }
    nums[j] = nums[i] + 0;
    nums[i] = lowestest;
  }
}
}
