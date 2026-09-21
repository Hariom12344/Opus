public class coin_change {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int target = 11;

        int count = 0;

        while (target > 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] <= target) {
                    target -= arr[i];
                    count++;
                    break;
                }
            }
        }

        System.out.println("Minimum elements: " + count);
    }
}