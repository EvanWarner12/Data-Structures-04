public class Main {

    public void sort(int arr[]) {
        int l = arr.length;

        for (int g = l / 2; g > 0; g /= 2) {
            for (int i = g; i < l; i++) {
                int k = arr[i];
                int x = i;
                while (x >= g && arr[x - g] > k) {
                    arr[x] = arr[x - g];
                    x -= g;
                }
                arr[x] = k;
            }
        }
    }
}
