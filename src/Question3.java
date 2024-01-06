import java.util.Arrays;
import java.util.OptionalInt;

import static java.lang.Math.min;

public class Question3 {
//    Given an array, find the length of smallest subarray which contains both min & max of array.
    public static void main(String[] args) {
        int[] array = {1,6,4,6,5,1,5,2,6,4,4,2,1};
        int ans = minMaxsmallsubLength(array);
        int ansReduced = minMaxsmallsubLengthReduced(array);
        System.out.println("ans : "+ans);
        System.out.println("ans : "+ansReduced);
    }
    static int minMaxsmallsubLength(int[] array){

        int minVal,maxVal;
        minVal = Arrays.stream(array).min().getAsInt();//for getting min of the array inbuilt function
        maxVal = Arrays.stream(array).max().getAsInt();//for getting max of the array inbuilt function
        int ans= array.length;
        if(minVal==maxVal){
            return 1;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==minVal){
                for(int j=i+1;j< array.length;j++)
                {
                    if(array[j]==maxVal){
                        ans = min(ans,j-i+1);
                        break;
                    }
                    if(array[j]==minVal){
                        break;
                    }
                }
            }else if(array[i]==maxVal){
                for(int j=i+1;j< array.length;j++)
                {
                    if(array[j]==minVal){
                        ans = min(ans,j-i+1);
                        break;
                    }
                    if(array[j]==maxVal){
                        break;
                    }
                }
            }
        }
        return ans;
    }
    static int minMaxsmallsubLengthReduced(int[] array){
        int minVal,maxVal;
        minVal = Arrays.stream(array).min().getAsInt();//for getting min of the array inbuilt function
        maxVal = Arrays.stream(array).max().getAsInt();//for getting max of the array inbuilt function
        int min_i=-1,max_i=-1;
        int ans= array.length;
        for(int i= 0;i< array.length;i++){
            if(array[i]==minVal){
                min_i=i;
                if(max_i!=-1) {
                    ans = min(min_i - max_i + 1, ans);
                }
            }
            if(array[i]==maxVal){
                max_i=i;
                if(min_i!=-1){
                    ans = min(max_i - min_i + 1, ans);
                }
            }
        }
        return ans;
    }
}
