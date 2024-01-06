public class Question2 {
//    Given an array, you have to find all leaders in array an element is a leader if it iut is strictly
//    greater than all elements on its right side.
    public static void main(String[] args) {
        int[] array={10,7,9,3,2,4};
        int max = array[array.length-1];
        int leaderCount = 1;
        for(int i= array.length-2;i>=0;i--){
            if(array[i]>max){
                max=array[i];
                leaderCount++;
            }
        }
        System.out.println("Leader : "+leaderCount);
    }
}
