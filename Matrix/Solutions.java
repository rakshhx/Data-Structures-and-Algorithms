//MATRIX

//41.	Search in a matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean ans = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target)
                    ans = true;
            }
        }
        return ans;
    }
}

//42.	Rotate by 90 degree

class Solution {
    public int[][] rotateMatrix(int[][] mat) {
        int n= mat.length;  //Number of Rows
        int m= mat[0].length; // NUmber of columns
        
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int j=0;j<m;j++){
        for(int i=0;i<n/2;i++){
            
                int temp=mat[i][j];
                mat[i][j]=mat[n-i-1][j];
                mat[n-i-1][j]=temp;
            }
        }
        
        return mat;
    }
}

//43.	Minimum num of 1's row

class Solution {
    int minRow(int mat[][]) {
        // code here
        int n= mat.length;
        int m=mat[0].length;
        int ans = 1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
    for(int j=0;j<m;j++){
        sum=sum+mat[i][j];
    }
    if(sum<min ){
        min=sum;
        ans=i+1;
    }
}
return ans;
    }
};

//44.	Left rotate matrix k times
//45.	Print matrix in diagonal pattern
//46.	Set matrix zeros
