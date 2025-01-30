import java.util.*;
import java.io.*;

public class baekjoon_5698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> l = new ArrayList<>();

        while(true) {
            String str = br.readLine();
            if (str.equals("*")) { // str == "*" 로 비교하면 안되더라 (무한루프)
                break;
            }
            String st = str.toUpperCase();
            l.add(st);
        }

        for(int j=0;j<l.size();j++){
            String[] list = l.get(j).split(" ");
            char first = list[0].charAt(0);
            boolean flag = true;
            for(int i=1;i<list.length;i++){
                if(list[i].charAt(0)!=first) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }

        }
    }
}
