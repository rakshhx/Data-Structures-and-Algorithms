//MUST SOLVE	

//34.	Majority element (Element that appears more than ⌊n / 2⌋ times)

//Moore's Voring Algorithm
class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count =1;
                ans= arr[i];
            }
            else if(arr[i]!=ans){
                count--;
            }else{
                count++;
            }
        }
        int anscount=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ans){
                anscount++;
            }
        }
        int countx=n/2;
        if(anscount > countx){
            return ans;
        }
        return -1;
    }
}

//35.	Kadane's algo(super imp) 

//Used to find the maximum subarray sum
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n= arr.length;
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}

//36.	Count inversions
//37.	Merge intervals
//38.	Maximum product subarray
//39.	Next permutation
//40.	Seive of eranthoses(Popular algo for prime numbers)
