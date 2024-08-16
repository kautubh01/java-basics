package arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = {10, 20}; // Initialize and assign values in one line
        
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception: " + e);
                e.printStackTrace();
            }
        }
    }
}
