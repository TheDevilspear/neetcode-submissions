class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character , Integer > hash_s = new HashMap<>();
        Map <Character, Integer > hash_t = new HashMap<>();
        if (s.length()!= t.length()){
            return false;
        }
        for (int i = 0 ; i <s.length() ; i++){
            hash_s.put(s.charAt(i),hash_s.getOrDefault(s.charAt(i),0)+1);
            hash_t.put(t.charAt(i),hash_t.getOrDefault(t.charAt(i),0)+1);

        }
        return hash_s.equals(hash_t);


        

    }
}
