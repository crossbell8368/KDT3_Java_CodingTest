package kdt3.codingtest;

import java.io.*;
import java.util.StringTokenizer;

public class Playground {

    public static void main(String[] args) throws IOException {

        System.out.println(recursive(10));

    }
    // 재귀함수 방식으로 풀이
    public static int recursive(int num){
        if(num == 1){
            return 1;
        }else if(num == 2){
            return 2;
        }else if(num == 3){
            return 4;
        }
        return recursive(num -1) - recursive(num-2) + recursive(num-3);
    }

    // 동적계획법 => 배열 생성 후, 각 배열의 인자들로 연산

}

