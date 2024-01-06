public class Question1 {
//    Given a char[], calculate no. of pairs i,j such that i<j and s[i]='a' && s[j]="g". All characters are lower case.
    public static void main(String[] args) {
        char[] array = {'a','d','g','a','g','a','g','f','g'};
        int ansRtoL = numofPairRtoL(array);
        System.out.println("ans Right to Left : "+ansRtoL);
        int ansLtoR = numofPairLtoR(array);
        System.out.println("ans Left to Right : "+ansLtoR);
    }
    static int numofPairLtoR(char[] array){
        //Right to Left(Home Work)
        int ans=0,cnt=0;
        for(int i=0;i< array.length;i++){
            if(array[i]=='a'){
                cnt++;
            }
            if(array[i]=='g'){
                ans = ans + cnt;
            }
        }
        return ans;
    }
    static int numofPairRtoL(char[] array){
        // Right to left
        int cnt=0,ans=0;
        for(int i=array.length-1;i>=0;i--){
            if(array[i]=='g'){
                cnt++;
            }
            if(array[i]=='a'){
                ans = ans + cnt;
            }
        }
        return ans;
    }
}
