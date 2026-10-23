package array;

public class Ascending {

    public static void main(String[] args) {

        int[] arr = {90, 50, 70, 60};

        // Descending
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }  System.out.print(arr[i] + " ");
        }

       

        System.out.println();

        // Ascending
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int aa = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aa;
                }
            } System.out.print(arr[i] + " ");
        }

        
           
        
    }
}