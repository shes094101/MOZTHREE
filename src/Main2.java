import java.util.Scanner;//判斷迴文

public class Main2 {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        String x = src.next();
        String y = "";
        for (int j = x.length() - 1; j >= 0; j--) {
            char a = x.charAt(j);
            y += a;
        }
        if (y.equals(x))
        {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}