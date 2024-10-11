public static boolean issprime(int n){
    int(n<=1){
        return false;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}