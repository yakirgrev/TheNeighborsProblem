//page 32 prac 46
public class Neighbors
{
   public static void main (String args[]){
       int matrix[][] = {{0,0,0,1,0,0,0},
                         {1,0,0,1,1,0,0},
                         {0,0,0,0,1,1,0},
                         {0,0,0,0,1,0,0},
                         {0,0,0,0,0,0,0},
                         {0,1,1,1,1,0,0},
                         {1,0,0,1,0,0,0}};
                         
       //printing the matrix
       for(int i=0; i<matrix.length; i++){
           System.out.println();
           for(int j=0; j<matrix[0].length; j++){
               System.out.print(matrix[i][j]+" ");
            }
        }        
        System.out.println();
        System.out.println();
        System.out.println(nCount(matrix,2,5));
        
    }
    
    public static int nCount(int matrix[][],int i,int j){    
        System.out.println("Current position: "+i+","+j);
        if (isValid(matrix,i,j)){           
            System.out.println("Valid!");
            matrix[i][j] = 3; //TRIED   
            return 1 +
            nCount(matrix,i+1,j)+ //down
            nCount(matrix,i,j+1)+ //right
            nCount(matrix,i-1,j)+ //up
            nCount(matrix,i,j-1); //left

        }
        return 0;
    }
   
    public static boolean isValid(int matrix[][],int i,int j){
        //if within boundaries & if there is a neighbour.
        if(j < matrix[0].length && i < matrix.length && i >= 0 && j >= 0 && matrix[i][j] == 1) return true;
        
        return false;
    }    
    
}
