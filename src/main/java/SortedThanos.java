public class SortedThanos {

    public static void sort(int[] mass) {
        float sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        sum = sum / mass.length;
        int n = 0, f = mass.length - 1;
        int[] arr = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] <= sum) {
                if (n == mass.length - 1) {
                    arr[f] = mass[i];
                    break;
                }
                arr[n] = mass[i];
                n++;
            } else {
                arr[f] = mass[i];
                f--;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            mass[i] = arr[i];
        }
        //это была первая итерация, дальше на 2 подмассива - до f и после него. И для них то же самое
        int[] arr1 = new int[n];
        int[] arr2 = new int[mass.length - n];
        for (int i = 0; i < n; i++) {
            arr1[i] = mass[i];

        }

        for (int i = 0; i < mass.length - n; i++) {
            arr2[i] = mass[i + n];
        }
        if (arr1.length > 1) {
            sort(arr1);
            for (int i = 0; i < n; i++) {
                mass[i] = arr1[i];
            }

        }
        if (arr2.length > 1) {
            sort(arr2);
            for (int i = 0; i < mass.length - n; i++) {
                mass[i + n] = arr2[i];
            }
        }

    }
}