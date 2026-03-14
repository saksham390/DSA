class Solution {
    public String reverseWords(String s) {
        String [] words=s.trim().split("\\s+");
        int l=0,r=words.length-1;
        while(l<r){
            String t=words[l];
            words[l]=words[r];
            words[r]=t;
            l++;
            r--;

        }
        return String.join(" ",words);
        
    }
}