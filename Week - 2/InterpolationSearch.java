public class InterpolationSearch{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 4;
        int left = 0;
        int right = arr.length-1;
        System.out.println(Interpolation(arr, target, left, right));
    }
    public static int Interpolation(int[] arr,int target, int left, int right){
        int pos = left + ((target - arr[left]) * (right - left)) / (arr[right] - arr[left]);
        if(arr[pos]<target){
            return Interpolation(arr, target,0,pos+1 );
        }
        else if(arr[pos]>target){
            return Interpolation(arr,target,pos-1,arr.length-1);
        }
        else if(arr[pos]==target){
            return pos;
        }
        return -1;
    }
}