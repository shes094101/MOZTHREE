import java.util.Scanner;//輾轉相除法

public class Main7 {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int n =src.nextInt();
        int m =src.nextInt();
        while (n!=0 && m!=0){
            if (n>=m){
                n=club(n,m);
            }else {
                m = sqort(n, m);
            }
        }
        if (n==0){
            System.out.println(m);
        }
        if (m==0){
            System.out.println(n);
        }
    }
    public static int club(int n,int m){
        while (n>=m){
            n=n-m;
        }
        return n;
    }
    public  static int sqort(int n,int m){
        while (m>=n){
            m=m-n;
        }
        return m;
    }
}

