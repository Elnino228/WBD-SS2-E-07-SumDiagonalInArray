public class SumDiagonalInArray {
    public static void main(String[] args) {
        int[][] squareArray={
                {1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4},
                {5,5,5,5,5}
        };
        int total=0;
        for (int i=0;i<squareArray.length;i++){
            for (int j=0;j<squareArray[i].length;j++){
                if (i==j)
                    total+=squareArray[i][i];
            }
        }
        //print total
        System.out.println("Total of element on main diagonal in array: "+total);
    }
}
