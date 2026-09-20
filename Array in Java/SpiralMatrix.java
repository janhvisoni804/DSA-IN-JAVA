public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5,6},{20,21,22,23,24,7},{19,32,33,34,25,8},{18,31,36,35,26,9},{17,30,29,28,27,10},{16,15,14,13,12,11}};
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(matrix[top][i]+"\t");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+"\t");
            }
            right--;
            //this covers the edge case also
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(matrix[bottom][i]+"\t");
                } 
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(matrix[i][left]+"\t");
                }
                left++;
            } 
        }
    }
}
