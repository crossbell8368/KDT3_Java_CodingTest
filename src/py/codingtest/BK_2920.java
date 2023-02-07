package py.codingtest;

import java.io.*;
import java.util.*;

public class BK_2920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> ary = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();

        for(int i = 1; i <= 8; i++){
            tmp.add(i);
        }
        while(st.hasMoreTokens()) {
            ary.add(Integer.parseInt(st.nextToken()));
        }

        if(ary.equals(tmp)){
            System.out.println("ascending");
        }else{
            tmp.sort(Comparator.reverseOrder());
            if(ary.equals(tmp)){
                System.out.println("descending");
            }else{
                System.out.println("mixed");
            }
        }
    }
}
