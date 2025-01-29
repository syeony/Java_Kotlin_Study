// 시간이 더 빠른 bufferedreader 사용해봄
import java.io.*;
import java.util.*;

public class baekjoon_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = 0;
        int Y = 0;

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            Y += (arr[i]/30+1)*10;
            M += (arr[i]/60+1)*15;
        }

        if(M==Y){
            System.out.println("Y M "+M);
        }else if(M<Y){
            System.out.println("M "+M);
        }else{
            System.out.println("Y "+Y);
        }

    }
}
