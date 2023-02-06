package kdt3.codingtest;

import java.io.*;
import java.util.*;

public class BK_1110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ary = new ArrayList<>();

        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        int res = num;

        while(true){
            cnt++;

            if(res < 10){
                ary.add(0);
                ary.add(res);
            }else{
                ary.add(res / 10);
                ary.add(res % 10);
            }
            res = (ary.get(1) * 10) + ((ary.get(0) + ary.get(1)) % 10);
            ary.clear();

            if(res == num){
                break;
            }
        }
        System.out.println(cnt);
    }
}
