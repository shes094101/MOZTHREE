import java.util.Scanner;//ooxx

public class Main5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int x[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = src.nextInt();
            }
        }
        int a =0;
        for (int i = 0 ; i < 3 ; i++) {
            if (x[0][i] == x[1][i] && x[0][i] == x[2][i]) {
                a++;}
                if (x[i][0] == x[i][1] && x[i][0] == x[i][2]) {
                a++;}
                    if (x[0][0]==x[1][1] && x[0][0] == x[2][2]){
                    a++;}
                       if (x[0][2]==x[1][1] && x[0][2] == x[2][0]){
                           a++;
                }
        }
        if (a!=0){
            System.out.println("True");
        }else {
            System.out.println("Flase");
            }
        }
    }


