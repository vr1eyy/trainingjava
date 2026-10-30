<<<<<<< HEAD
public class array5 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The first largest value is: " + largest);
        System.out.println("The second largest value is: " + secondLargest);
    }
=======
public class array5 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The first largest value is: " + largest);
        System.out.println("The second largest value is: " + secondLargest);
    }
>>>>>>> 2e5003e42cd8cfa5ea21232290f7ca6b70554fb7
}