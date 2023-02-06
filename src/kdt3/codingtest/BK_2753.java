package kdt3.codingtest;

import java.io.*;

public class BK_2753 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();

        int res = Integer.parseInt(inputData);
        if((res % 4 == 0) && ((res % 100 != 0) || (res % 400 == 0))){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
