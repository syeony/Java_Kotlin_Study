import java.io.*;

public class baekjoon_2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        boolean flag = true;

        while(true){
            if(n==1 || n==2){
                flag = false;
                break;
            }
            if(n==0){
                break;
            }
            if(n%5==0){
                count+=n/5;
                n-=((n/5)*5);
            }else{ // 예시: 17
                n-=3;
                count+=1;
            }
        }

        if(flag){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
}
