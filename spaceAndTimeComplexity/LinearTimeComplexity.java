public class LinearTimeComplexity {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < arr.length; i++) // time complexity O(n) and space complexity(1) because no memory is used
        {
            System.out.println(arr[i]);
        }

        // now looking for 0(n) space complexity
        int arr2[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int arr3[] = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i]; // now space and time Complexity is o(n)
        }
    }
}
