import java.util.*;

public class baekjoon_2442 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int x=1;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
