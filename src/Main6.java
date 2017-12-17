import java.util.Scanner;//矩陣反轉

public class Main6
{
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int m =src.nextInt();
        int n =src.nextInt();
        int x [][] =new int[m][n];
        for (int i=0 ; i<m ;i++){
            for (int j=0;j<n ;j++){
                x[i][j]=src.nextInt();
            }
        }
        for (int i=0 ; i<n ;i++){
            for (int j=0;j<m ;j++){
                System.out.print(x[j][i]+"\t");
            }
            System.out.println();
        }
    }
}