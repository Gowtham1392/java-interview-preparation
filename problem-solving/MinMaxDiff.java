// Problem link -> https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/min-max-difference/

import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 0; i < N; i++){
            int max = s.nextInt();
            int min = s.nextInt();
            int elements = max - min;
            int[] arr = new int[max];
            for(int j = 0; j < max; j++){
                arr[j] = s.nextInt();
            }
            int temp = 0;
            for(int j = 0; j < max - 1; j++){
                for(int k = 0; k < max - j -1; k++){
                    if(arr[k] > arr[k + 1]){
                        temp = arr[k]; 
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                    }
                }
            }
            int minSum = 0;
            for(int j = 0; j < elements; j++){
                minSum += arr[j];
            }
            int maxSum = 0;
            for(int j = max - 1; j >= (max - elements); j--){
                maxSum += arr[j];
            }
            System.out.println(maxSum - minSum);
        }
    }
}
