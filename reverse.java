class reverse{
    public static void main(String[] args){
        int n=23451;
        int sum=0;
        while(n!=0){
        int rev=n%10;
        sum=(sum*10)+rev;
        n=n/10;
    }
    System.out.println("Reverse is : " +sum);
}
}