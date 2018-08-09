import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.asList;

/*
Given two arrays of integers, return all pairs of elements such that they add up to a specific target (one element in each array).
 */
public class TwoSum {
    public List<List<Integer>> twoSum(int[] a, int[] b, int n, int m, int target){
        if(a == null || b == null || a.length == 0 || b.length == 0){
            return null;
        }

        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(a[i], i);
            for(int j = 0; j < m; j++){
                if(map.containsKey(target - b[j])){
                    res.add(Arrays.asList((target - b[j]), b[j]));
                }
            }
        }
        return res;
    }
}
//Time = O(n), Space = O(n)