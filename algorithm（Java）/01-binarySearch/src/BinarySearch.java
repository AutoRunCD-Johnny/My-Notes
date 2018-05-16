public final class BinarySearch<T extends Comparable<? super T>> {

    private BinarySearch() {
        // prevent instantiation
    }

    public int binarySearch(T[] arr, int n, T target) {

        int left = 0, right = n - 1; // �� [left, right] ������Ѱ�� target

        while (left <= right) { // �� left = right ʱ������ [left, right] ��Ȼ��Ч
            int mid = left + (right - left) / 2;
            if (arr[mid].compareTo(target) == 0)
                return mid;
            if (target.compareTo(arr[mid]) > 0)
                left = mid + 1; // target �� [mid+1, r] ��
            else
                right = mid - 1; // target �� [left, mid - 1] ��
        }

        return -1;
    }

    public static void main(String[] args) {

        BinarySearch<Integer> bs = new BinarySearch<Integer>();
        int n = (int)Math.pow(10, 7); // �� 10,000,000 ���ݲ���
        Integer[] data = ArrayUtil.generateSortedArray(n);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            if (i != bs.binarySearch(data, n, i))
                throw new IllegalStateException("find i failed");
        long endTime = System.currentTimeMillis();

        System.out.println("Binary Search success!");
        System.out.println("Time cost: " + (endTime - startTime) + "ms");
    }
}