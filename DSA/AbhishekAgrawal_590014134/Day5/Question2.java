class Question2 {
    public boolean areArraysEqual(int[] arr1, int[] arr2) {
        
        // Check if sizes are different
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare corresponding elements
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}