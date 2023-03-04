class Solution1{
    public static int impressGeekina(long n, int k){
        // Code Here.
         int totalLeaves = 1;
        int additionalTrees = 0;

        while (totalLeaves < n) {
            additionalTrees++;
            totalLeaves += additionalTrees;
        }

        if (totalLeaves == n) {
            return additionalTrees;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        int additionalTrees = impressGeekina(n, k);

        if (additionalTrees == -1) {
            System.out.println("It is not possible to impress Geekina.");
        } else {
            System.out.println("Minimum additional trees required: " + additionalTrees);
        }
    }
        
 }