package kdt3.codingtest;

import java.io.*;
import java.util.*;

public class BK_2501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> ary = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        while(st.hasMoreTokens()){
            ary.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 1; i <= ary.get(0); i++){
            if(calc(ary.get(0), i) > 0){
                res.add(calc(ary.get(0), i));
            }
        }

        if(res.size() >= ary.get(1)){
            System.out.println(res.get(ary.get(1) - 1));
        }else{
            System.out.println(0);
        }
    }
    public static int calc(int p, int q){
        if(p % q == 0){
            return q;
        }else{
            return 0;
        }
    }
}
