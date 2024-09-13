public class FibonacciSearch {
    public static int min(int x, int y) {
        return (x <= y) ? x : y;
    }
    public static int fibonacciSearch(int[] arr, int x, int n) {
        int fibMMm2 = 0;  // (m-2)'th Fibonacci number
        int fibMMm1 = 1;  // (m-1)'th Fibonacci number
        int fibM = fibMMm2 + fibMMm1;  // m'th Fibonacci number

        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }
        int offset = -1;
        while (fibM > 1) {
            int i = min(offset + fibMMm2, n - 1);

            // If x is greater than the value at index i, cut the subarray from offset to i
            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            }
            // If x is less than the value at index i, cut the subarray after i+1
            else if (arr[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            }
            // Element found. Return index
            else {
                return i;
            }
        }
        // Comparing the last element with x
        if (fibMMm1 == 1 && arr[offset + 1] == x) {
            return offset + 1;
        }
        // Element not found. Return -1
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int n = arr.length;

        int index = fibonacciSearch(arr, x, n);
        
        if (index >= 0) {
            System.out.println("Element " + x + " is present at index: " + index);
        } else {
            System.out.println("Element " + x + " is not present in the array.");
        }
    }
}