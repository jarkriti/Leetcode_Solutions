class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if(matrix.length==0)
            return res;
        /*
        dir = 0 => L to R
        dir = 1 => T to B
        dir = 2 => R to L
        dir = 3 => B to T
        
        */
        
        
        int T = 0;
        int B = matrix.length-1;
        int L = 0;
        int R = matrix[0].length-1;
        int dir = 0;
        int i;
        
        while(T<=B && L<=R)
        {
            if( dir==0){
                i=L;
                while(i<=R){
                    res.add(matrix[T][i]);
                    i++;
                }
                T++;
            }
            else if( dir ==1){
                i=T;
                while(i<=B){
                    res.add(matrix[i][R]);
                    i++;
                }
                R--;
            }
            else if( dir == 2){
                i = R;
                while(i>=L){
                    res.add(matrix[B][i]);
                    i--;
                }
                B--;
            }
            else if(dir==3){
                i = B;
                while(i>=T){
                    res.add(matrix[i][L]);
                    i--;
                    
                }
                L++;
            }
        
            dir = (dir+1)%4;
        }
        
        return res;
        
    }
}