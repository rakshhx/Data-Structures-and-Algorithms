//Matrix	

//67.	Find row with maximum number of 1's


//68.	Search in row wise column wise sorted matrix

class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n =mat.length;
        int m =mat[0].length;
        boolean ans=false;
        int low=0,high=(n*m)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col] == x){
                ans=true;
                break;
            }
            else if(mat[row][col] > x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}

//69.	Search in sorted matrix II


//70.	Find peak in sorted matrix


