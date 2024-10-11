class smallest{
    public static void main(String []args){
        int arr[]={20,10,3,6,4};
        int min=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest number in this array is :"+min);
    }
}