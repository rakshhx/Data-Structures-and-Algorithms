//TWO POINTER

//23.	Find pair with given sum

class Solution {
    boolean twoSum(int arr[], int target) {
        boolean ans=false;
        int n= arr.length;
        int start=0;
        int end=n-1;
        Arrays.sort(arr);
        int sum=0;
        while (start < end ){
                sum=arr[start]+arr[end];
                if(sum==target){
                    return ans=true;
                }
                else if(sum > target) end--;
                else if(sum < target) start++;
            }
        return ans;
    }
}
//24.	3 Sum

class Solution {
  
    public static boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        int n=arr.length;
        boolean ans = false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target) ans=true;
                }
            }
        }
        return ans;
    }
}
//25.	4 Sum

//26.	Find triplets with zero sum

class Solution {
    public boolean findTriplets(int[] arr) {
        boolean ans=false;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        ans=true;
                    }
                }
            }
        }
        return ans;
    }
}
//27.	Find count of triplets a + b = c

class Solution {
    int countTriplet(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;

            while (i < j) {
                int sum = arr[i] + arr[j];

                if (sum == arr[k]) {
                    count++;
                    i++;
                    j--;
                } else if (sum < arr[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return count;
    }
}

//28.	Union of two arrays

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> st= new HashSet<>();
        for(int i : a){
            st.add(i);
        }
        for(int i : b){
            st.add(i);
        }
        
        for(int j: st){
            res.add(j);
        }
        
        return res;
    }
}

//29.	Intersection of two arrays

class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        HashSet<Integer> st = new HashSet<>();
        int count=0;
        for(int nums:a){
            st.add(nums);
        }
        
        for(int nums : b){
            if(st.contains(nums)){ 
                count++;
                st.remove(nums);
            }
        }
        return count;
    }
}

//30.	Remove duplicates from array

class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }

        int point = 0; // Index of last unique element
        for (int i = 1; i < n; i++) {
            if (arr[point] != arr[i]) {
                point++;
                arr[point] = arr[i];
            }
        }

        return point + 1; // New length of array with unique elements
    }
}

//31.	kth element of 2 sorted arrays

class Solution {
    public int kthElement(int a[], int b[], int k) {
        ArrayList<Integer> al = new ArrayList<>();
        int n1 = a.length - 1;
        int n2 = b.length - 1;
        for(int i=0;i<=n1;i++){
            al.add(a[i]);
        }
        for(int j=0;j<=n2;j++){
            al.add(b[j]);
        }
        Collections.sort(al);
        return al.get(k-1);
        
    }
}

//32.	Length of longest subarray with sum k


//33.	Trapping rain water

