import java.util.*;

/**
 * Created by perl on 2019/7/30.
 *
 * 347. Top K Frequent Elements
 *
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Note:
 *
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        List<Integer> topK = new ArrayList<>();
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        Arrays.stream(nums).forEach(e -> frequencyForNum.put(e, frequencyForNum.getOrDefault(e, 0) + 1));

        frequencyForNum.forEach((key,val) -> {
            int frequency = frequencyForNum.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        });

        for (int i = buckets.length - 1; i >= 0 && topK.size() < k; i--) {
            if (buckets[i] == null) {
                continue;
            }
            if (buckets[i].size() <= (k - topK.size())) {
                topK.addAll(buckets[i]);
            } else {
                topK.addAll(buckets[i].subList(0, k - topK.size()));
            }
        }

        return topK;
    }

    public static void main(String[] args) {
        System.out.println(TopKFrequentElements.topKFrequent(new int[] {1,2,2,2,2,1,3},2));
        System.out.println(TopKFrequentElements.topKFrequent(new int[] {1},1));
    }
}
