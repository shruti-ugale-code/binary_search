public class Basic_binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int key=5;
        int ans=findele(arr,key);
        System.out.println(ans);

    }
    public static int findele(int arr[],int key){
        int start=0;
        int end=arr.length-1;

        int mid=start+(end -start)/2;


        while(start<end){
            if (key < arr[mid]) {
                mid=mid-1;

            } else if (key>arr[mid]) {
                mid=mid+1;


            }else{
                return mid;
            }
        }
        return -1;
    }
}

