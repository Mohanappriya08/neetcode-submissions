class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int area = 0;
        while(start<end){
            int newArea = Math.min(heights[start],heights[end])* (end-start);
            if(newArea > area) area = newArea;
            if(heights[start]>heights[end]) end--;
            else start++;

        }
        return area;
    }
}
