public class UniformBinarySearch {
   public static int[] createLookupTable(int size) {
      int[] lookupTable = new int[size];
      for (int i = 0; i < size; i++) {
         lookupTable[i] = (i + size) / 2;
      }
      return lookupTable;
   }

   public static int recursiveUniformBinarySearch(int[] arr, int key, int[] lookupTable, int left, int right) {
      if (left > right) {
          return -1; // Base case: key not found
      }

      // Use the lookup table to get the midpoint
      int mid = lookupTable[left + (right - left)/2];

      if (arr[mid] == key) {
          return mid; // Key found
      } else if (arr[mid] > key) {
          return recursiveUniformBinarySearch(arr, key, lookupTable, left, mid - 1); // Search in the left half
      } else {
          return recursiveUniformBinarySearch(arr, key, lookupTable, mid + 1, right); // Search in the right half
      }
  }

   public static void main(String[] args) {
      int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
      int[] lookupTable = createLookupTable(arr.length);
      int key = 91;
      int ans = recursiveUniformBinarySearch(arr, key, lookupTable, 0, arr.length - 1);
      System.out.print(ans);
   }

}