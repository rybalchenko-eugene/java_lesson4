

public class quicksort {
    public static void main(String[] args) {
        int [] array = {2,7,4,9,34,-7,9,5,3,6,34,76,22,4,1,0};
        print(array);
        sort(array, 0, array.length-1);

    }
    public static int partition(int [] lst, int start, int end) {

        int pivot = end;
        int num = start;
        for (int i = start; i < end; i++) {
            if (lst[i] < lst[pivot]){
                int temp = lst[i];
                lst[i] = lst[num];
                lst[num] = temp;
                num++;
            }
        }
        int temp = lst[num];
        lst[num] = lst[pivot];
        lst[pivot] = temp;
        System.out.println(num);
        print(lst);
        return num;
    }
    public static void print(int [] lst) {
        for (int i : lst) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(int [] lst, int start, int end) {

        if (start >= end) return;
        int part = partition(lst, start, end);
        sort(lst, start, part-1);
        sort(lst, part+1, end);
    }
}
