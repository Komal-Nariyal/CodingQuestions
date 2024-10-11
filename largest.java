class largest{
    public static void main(String[]args){
       int array[]={1, 4, 6, 7 , 8, 9};
       int max=array[0];
       for(int i=0;i<array.length; i++){
        if(array[i]>max){
            max=array[i];
        }
       }
        System.out.println("The max no of this array is : "+max);
       


    }
}