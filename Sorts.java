public class Sorts{
  public static boolean check(int nums[]) {
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < nums[i - 1]) {
        return false;
      }
    }
    return true;
  }
  /**Selection sort of an int array.
    *Upon completion, the elements of the array will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void selectionSort(int[] data){
    for (int i = 0; i < data.length; i ++) {
      // sets the current lowest to the first number
      int lowest = data[i];
      //saves the index of the lowest number
      int index = i;
      //loops through to find a number less than i then save it and it's index
      for (int j = i; j < data.length; j++) {
        // only take it in if it is the lowest so far
        if (data[j] < lowest) {
          lowest = data[j];
          index = j;
        }
  }
  // need a temporvary variable to allow a swap to happen
  int temp = data[i];
  data[i] = data[index];
  data[index] = temp;
}

}



  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    //while trigger is false the loop will continue to run
    boolean trigger = false;
    while (trigger == false) {
      // sets it to true every time it goes through all the numbers
      trigger = true;
      for(int i = 0; i < data.length - 1; i++) {
        if (data[i] > data[i + 1]) {
          // sets trigger to false if there is a swap
          trigger = false;
          // quick swap;
          int temp = data[i];
          data[i] = data[i + 1];
          data[i + 1] = temp;
        }
      }
    }
}

  public static void insertionSort(int[] data) {
    for (int j = 0; j < data.length; j++)
      for(int i = 0; i < j; i++) {
        if (num > data[i]) {
          
        }
    }
  }




  }








}
