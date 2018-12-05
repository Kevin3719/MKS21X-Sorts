public class Sort{
  public static boolean check(int nums[]) {
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < nums[i - 1]) {
        return false;
      }
    }
    return true;
  }
  public static void selectionSort(int nums[]) {
    for (int i = 0; i < nums.length; i ++) {
      int lowest = nums[i];
      int index = i;
      for (int j = i; j < nums.length; j++) {
        if (nums[j] < lowest) {
          lowest = nums[j];
          index = j;
        }
  }
  int temp = nums[i];
  nums[i] = nums[index];
  nums[index] = temp;
}

}
}
