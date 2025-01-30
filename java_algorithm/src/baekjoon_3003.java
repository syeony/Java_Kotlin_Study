import java.io.*;
import java.util.*;

public class baekjoon_3003 {
    public static void main(String[] args) throws IOException {
        int[] answer = {1,1,2,2,2,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[answer.length];

        for(int i=0;i<answer.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]!=answer[i]){
                arr[i] = (answer[i]-arr[i]);
            }else{
                arr[i]=0;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
