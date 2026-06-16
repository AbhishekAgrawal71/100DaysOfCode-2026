// Question: Count the number of occurrences of the target in the array.
// Time Complexity: O(N)
// Space Complexity: O(1)

class Question2 {
    public static void main(String args[]) {
        int array[] = {1, 1, 2, 2, 2, 2}; 
        int target = 2;
        int result = 0;
        int count = array.length;

        for (int i = 0; i < count; i++){
            if (array[i] == target){
                result += 1;
            }
        }
        
        System.out.println(result);
    }
}
