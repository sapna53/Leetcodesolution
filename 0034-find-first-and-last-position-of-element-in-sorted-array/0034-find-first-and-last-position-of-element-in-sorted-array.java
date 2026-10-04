class Solution {
    public int[] searchRange(int[] arr, int target) {
    int[] ans ={-1,-1};
    int  n= arr.length; 
       int lo=0 ;
       int  hi=n-1;
      boolean flag =false; // false means not present
  
    // first check if element is present
    while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(arr[mid]==target){
         flag =true;
         break;
        }
        else if (arr[mid]>target ) hi=mid-1;
        else if (arr[mid]< target) lo=mid+1; 
    }
    if (flag==false) return ans;

    // now find lower bound 
       int lb=n;
         lo = 0;
         hi=n-1;
    while(lo <= hi){
    int mid = lo + (hi - lo) / 2;

    if(arr[mid] >= target){
        lb = Math.min(lb, mid);
        hi = mid - 1;
    }
    else{
        lo = mid + 1;
    }}
    ans[0] = lb;
    // now find upper bound 
      int ub=n;
         lo=0;
        hi=n-1;
    while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(arr[mid]>target){
         ub=Math.min(ub,mid);
         hi = mid-1;
        }
        else lo=mid+1;
    }
    ans[1]=ub-1;
    return ans;
    }
}