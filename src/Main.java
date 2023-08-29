import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        int[] test = {3, 6, 5, 1, 4};
        System.out.println(new Solution().findKthLargest(test, 3));

    }

}


// .offer inserts element into heap, returns boolean for if added
// .poll retrieves and removes the head of the queue or returns null if empty
// .add appears same as .offer but overrides AbstractQueue method
// .remove is same as .poll except doesn't throw exception if queue is empty

// in this problem at least, offer/add and poll/remove are interchangeable and negligible efficiency differences

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.offer(num);
            if (heap.size() > k) { // states that if heap size greater than k, then we remove head, which is min value
                heap.poll();
                // consequently, after enhanced for loop is complete, only K elements will be a part of the heap and
                // they will be the largest elements
            }
        }
        return heap.peek(); // when we return peek, this returns the head and since head is the least value, it will
        // be the Kth greatest value among the int[] array
    }
}


//class Solution {
//    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> numQue = new PriorityQueue<>(Collections.reverseOrder());
//        for (int i : nums) {
//            numQue.offer(i);
//        }
//
//        int count = 1;
//        while (!numQue.isEmpty()) {
//            if (count == k) {
//                return numQue.poll();
//            } else numQue.poll();
//            count++;
//        }
//        return -1;
//    }
//}


