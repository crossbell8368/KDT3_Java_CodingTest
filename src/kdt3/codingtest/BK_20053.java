package kdt3.codingtest;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BK_20053 {
    public static void main(String[] agrs) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            int arySize = Integer.parseInt(br.readLine());
            ArrayList<Integer> ary = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                ary.add(Integer.parseInt(st.nextToken()));
            }
            ary.sort(Comparator.naturalOrder());
            System.out.println(ary.get(0) + " " + ary.get(arySize - 1));
        }
    }
}
