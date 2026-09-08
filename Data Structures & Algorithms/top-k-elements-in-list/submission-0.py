class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        buckets = [[] for i in range(len(nums) + 1 )]
        
        for num in nums:
            count[num] = 1 + count.get(num,0)
        
        for u,v in count.items():
            buckets[v].append(u)
        
        res = []
        for i in range(len(buckets)- 1,-1,-1):
            for j in buckets[i]:
                res.append(j)
                if len(res) == k:
                    return res