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
      // sets the current lowest to the first number
      int lowest = nums[i];
      //saves the index of the lowest number
      int index = i;
      //loops through to find a number less than i then save it and it's index
      for (int j = i; j < nums.length; j++) {
        // only take it in if it is the lowest so far
        if (nums[j] < lowest) {
          lowest = nums[j];
          index = j;
        }
  }
  // need a temporvary variable to allow a swap to happen
  int temp = nums[i];
  nums[i] = nums[index];
  nums[index] = temp;
}

}
}
