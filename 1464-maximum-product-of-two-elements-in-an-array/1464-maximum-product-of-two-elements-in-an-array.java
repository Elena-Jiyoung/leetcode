class Solution {
    PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(3);
    
    public int maxProduct(int[] nums) {
        for (int i = 0; i < nums.length; i++ ) {
            if (minheap.size() < 3) {
                minheap.add(nums[i]);
            } else {
                minheap.poll();
                minheap.add(nums[i]);
            }
        }
        if (minheap.size() == 2) {
            return (minheap.poll()-1)*(minheap.poll()-1);
        }
        
        minheap.poll();
        return (minheap.poll()-1)*(minheap.poll()-1);
    }
    
}