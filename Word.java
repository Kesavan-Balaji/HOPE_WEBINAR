import java.util.*;
public class Word{
    static int dirs[][]={{-1,-1},{1,1},{-1,0},{0,-1},{0,1},{1,0},{1,-1},{-1,1}};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        sc.nextLine();
        char board[][]=new char[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                board[i][j]=sc.next().charAt(0);
            }
        }
        sc.nextLine();
        String word=sc.nextLine();

        System.out.println(exist(board,word)?"EXIST":"NOT-EXIST");
        sc.close();
    }

    public static boolean exist(char board[][],String word){
        int R=board.length;
        int C=board[0].length;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(board[row][col]==word.charAt(0)){
                    boolean found=find(board,R,C,row,col,word,1);
                    if(found) return true;
                }
            }
        }
        return false;
    }

    public static boolean find(char board[][],int R,int C,int row,int col,String word,int ind){
        if(ind==word.length()){
            return true;
        }
        char back=board[row][col];
        board[row][col]='$';
        for(int d[]:dirs){
            int adjR=d[0]+row;
            int adjC=d[1]+col;
            if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && board[adjR][adjC]==word.charAt(ind)){
                boolean found=find(board,R,C,adjR,adjC,word,ind+1);
                if(found) return true;
            }
        }
        board[row][col]=back;
        return false;
    }
}
