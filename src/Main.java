import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        int [] test = {3,6,5,1,4};
        System.out.println(new Solution().findKthLargest(test,3));

    }

}


class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> numQue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: nums){
            numQue.offer(i);
        }

        int count = 1;
        while (!numQue.isEmpty()){
            if(count == k){
                return numQue.poll();
            }
            else numQue.poll();
            count++;
        }
        return -1;
    }
}