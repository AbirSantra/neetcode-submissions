class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());

        for(Map.Entry entry: freq.entrySet()){
            maxHeap.add(entry);
        }

        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = maxHeap.poll().getKey();
        }

        return ans;
    }
}
