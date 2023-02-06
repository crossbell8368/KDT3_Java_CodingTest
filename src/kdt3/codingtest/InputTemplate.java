package kdt3.codingtest;

import java.io.*;
import java.util.*;
public class InputTemplate {
    public static void main(String[] args) throws IOException{
        String inputData = """
        5
        4 1 5 2 3
        4
        1 3 7 9 5      
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ary1 = new ArrayList<>();
        ArrayList<Integer> ary2 = new ArrayList<>();

        int num1 = Integer.parseInt(br.readLine());
        System.out.println(num1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            ary1.add(Integer.parseInt(st.nextToken()));
        }
        ary1.sort(Comparator.reverseOrder());
        System.out.println(ary1);

        int num2 = Integer.parseInt(br.readLine());
        System.out.println(num2);
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            ary2.add(Integer.parseInt(st.nextToken()));
        }
        ary2.sort(Comparator.reverseOrder());
        System.out.println(ary2);
    }
}
