class Solution {
    public int maxDifference(String s) {
        HashMap <Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        } // a=5 b=2 c=1 d=4;
        int even=Integer.MAX_VALUE;
        int odd=0;
        for(char ch:map.keySet())
        {
            if(map.get(ch)%2==0)
            {
               even=Math.min(even,map.get(ch));
            }
            else
            {
                odd=Math.max(odd,map.get(ch));
            }
        }
        return odd-even;
    }
}