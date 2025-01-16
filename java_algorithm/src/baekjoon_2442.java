import java.util.*;

public class baekjoon_2442 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int x=0;x<star;x++){
                System.out.print("*");
            }
            star+=2;
            System.out.println();
        }
    }
}
