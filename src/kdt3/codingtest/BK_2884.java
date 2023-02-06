package kdt3.codingtest;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BK_2884 {

    public static void main(String[] args) throws IOException{

        ArrayList<Integer> ary = new ArrayList<>();
        int hour = 0;
        int min = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            ary.add(Integer.parseInt(st.nextToken()));
        }

        if(ary.get(1) - 45 < 0){
            min = 60 + (ary.get(1) - 45);
            hour = ary.get(0) - 1;
        }else{
            min = ary.get(1) - 45;
            hour = ary.get(0);
        }
        if(hour < 0){
            hour = 23;
        }
        System.out.println(hour + " " + min);
    }
}
