public class ArrayUtil {

    private ArrayUtil() {
        // prevent instantiation
    }

    /**
     * ���ɰ��� n ��Ԫ�ص���������
     * @param n n
     * @return Integer ����
     */
    public static Integer[] generateSortedArray(int n) {

        assert n > 0;

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }
}