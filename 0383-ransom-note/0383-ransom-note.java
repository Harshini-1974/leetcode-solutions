class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     HashMap<Character,Integer> map= new HashMap<>();
        if(magazine.length()<ransomNote.length()) return false;
     for(int i=0;i<ransomNote.length();i++)
     {
        map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)+1);
     }
     for(int i=0;i<magazine.length();i++)
     {
        if(map.containsKey(magazine.charAt(i)))
        {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)-1);
            
        }
     }
     System.out.println(map);
     for(int i=0;i<ransomNote.length();i++)
     {
        if(map.get(ransomNote.charAt(i))>0)
        {
           
            return false;
        }
     }
     

     return true;
    }
}