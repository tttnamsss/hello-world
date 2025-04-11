public class ArraySorter {

  /**
   * Sorts the given array in ascending order using an optimized bubble sort.
   *
   * @param array the array to be sorted
   */
  public static void sortAscending(int[] array) {
    if (array == null || array.length < 2) {
      return; // Nothing to sort
    }

    for (int i = 0; i < array.length - 1; i++) {
      boolean swapped = false;
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break; // Array is already sorted
      }
    }
  }

  public static void main(String[] args) {
    int[] numbers = {4, 2, 7, 1, 9, 0};
    sortAscending(numbers);

    System.out.println("Sorted array:");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }
}


