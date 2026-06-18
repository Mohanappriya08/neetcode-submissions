class Solution {
    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            System.out.println(s.charAt(start));
            System.out.println(s.charAt(end));
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start+=1;
                continue;}
            if(!Character.isLetterOrDigit(s.charAt(end))) {
                end-=1;
                continue;
                }
            if(s.toLowerCase().charAt(start) != s.toLowerCase().charAt(end)) return false;
            else {
            start+=1;
            end-=1;
            }
        }
        return true;
    }
}
