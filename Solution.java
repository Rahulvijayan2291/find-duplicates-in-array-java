class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        
        for(int num : arr){
            if(!seen.add(num)){
                result.add(num);
            }
        }
        return result;
    }
}
