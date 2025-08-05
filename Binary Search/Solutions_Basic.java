//Basic pattern	

//54.	Search in a sorted array

class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        boolean ans=false;

        while(low<=high){
            int mid=low+((high-low)/2);
            if(arr[mid]==k){
                ans=true;
                break;
            }else if(arr[mid] > k) high=mid-1;
            else low=mid+1;
        }
        return ans;
    }
}

//55.	Find floor ( largest element in arr[] that is less than or equal to x) in sorted array

class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;;
            }else high=mid-1;
        }
 
           return ans;
}
}

//56.	Find first and last occurence of element in sorted array


//57.	Find missing num from 1 to N


//58.	Find square root

int floorSqrt(int n) {
    int low=0;
    int high=n;
    int ans=-1;
    while(low <= high){
        int mid = (low+high)/2;
        int a = mid*mid;
        if(a == n){ 
            ans = mid; 
            break;
        }
        else if(a > n){
            if(a <n) ans=mid;
            high=mid-1;
            
        }else{
            ans=mid;
            low=mid+1;
        }
    }
    return ans;
}
//59.	Search for element in infinite array
