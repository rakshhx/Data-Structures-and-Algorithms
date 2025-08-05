//ARRAYS

//13.	Find the maximum and minimum element in array(After solving the search , you can solve all probs in this basics by yourself)

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int min=0;
        int max=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=max){
                max= arr[i];
            }
        }
    min = max;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        return new Pair<>(min,max);
    }
}

//14.	Find third largest element in array

class Solution {
    int thirdLargest(int arr[]) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        
        if(arr.length < 3) return -1;
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }else if (arr[i]>max2){
                max3=max2;
                max2=arr[i];
            }else if (arr[i]>max3){
                max3=arr[i];
            }
        }
        return max3;
    }
}

//15.	Search an element in array(Understand how to traverse through the array and how to access the elements)

class Solution {

    static int search(int arr[], int x) {
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index =i;
                break;
            } else{
                index = -1;
            }
        }
        return index;
    }
}

//16.	Find missing number in array ranging from 1 to n

class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n;
    }
}

//17.	Sort an array of 0s , 1s and 2s (You dont need to know any sorting algo, just using basics, once solved, definitely learn the optimal algo)

class Solution {
    public int[] sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count occurrences
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else count2++;
        }

        // Refill the array
        int i = 0;
        while (count0-- > 0) arr[i++] = 0;
        while (count1-- > 0) arr[i++] = 1;
        while (count2-- > 0) arr[i++] = 2;

        return arr;
    }
}

//18.	Check if two arrays are equal or not

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                count=count+1;
            }
        }
        if(count==a.length){
        return true;
    }else{
        return false;
    }
    }
}
//19.	Rotate the array by 1

class Solution {
    public int[] rotate(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0]=temp;
        return arr;
    }
}

//20.	Right Rotate the array by k

class Solution {
    public int[] reverse(int[] a,int start, int end){
        while(start < end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return a;
    }
    public int[] rotate(int[] arr, int k) {
       k=k%arr.length;
       int n=arr.length;
       reverse(arr,0,n-k-1);
       reverse(arr,n-k,n-1);
       reverse(arr,0,n-1);
           return arr;

    }
}
//21.	Array subset of another array

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        int i = 0, j =0;
        for(;i<a.length && j < b.length;i++){
            if(a[i] == b[j]){
                count++;
                j++;
            }
        }
        return count==b.length;
    }
}
//22.	Count frequency of elements in array
class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int n= arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int a = hm.get(arr[i]);
                hm.put(arr[i],a+1);
            }
            else{
                hm.put(arr[i],1);
            }
            }
            
        for(int i=1;i<=n;i++){
            if(hm.containsKey(i)){
                al.add(hm.get(i));
            }else{
                al.add(0);
            }
        }
                return al;

        }
    }
