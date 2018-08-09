public class Test {
    public static void main(String[] args){
        TwoSum sol = new TwoSum();
        int target = 8;
        int[] a = {2, 6, 5, 8, 9, 1};
        int[] b = {3, 1, 9, 3};
        int n = 6;
        int m = 4;
        System.out.println(sol.twoSum(a, b, n, m, target));
    }
}
