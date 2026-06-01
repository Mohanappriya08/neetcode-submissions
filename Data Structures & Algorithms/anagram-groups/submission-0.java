class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
              if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> data = new HashMap<>();
        for (String s: strs) {
            char[]ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!data.containsKey(key)) {
                List<String> word = new ArrayList<>();
                word.add(s);
                data.put(key, word);
            } else {
                data.get(key).add(s);
            }
        }
        return new ArrayList<>(data.values());
    }
}
