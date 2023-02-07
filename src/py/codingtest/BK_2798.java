package py.codingtest;

import java.io.*;
import java.util.*;

public class BK_2798 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> tmp = new ArrayList<>();
        ArrayList<Integer> ary = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        tmp = inputAry(st, br);

        st = new StringTokenizer(br.readLine());
        ary = inputAry(st, br);

        ary.sort(Comparator.reverseOrder());
        System.out.println(calc(ary, tmp.get(1)));
    }

    public static ArrayList<Integer> inputAry (StringTokenizer st, BufferedReader br){
        ArrayList<Integer> ary = new ArrayList<>();

        while(st.hasMoreTokens()){
            ary.add(Integer.parseInt(st.nextToken()));
        }
        return ary;
    }

    public static int calc(ArrayList<Integer> ary, int tar){
        int size = ary.size();
        int res = 0;

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                for(int k = j + 1; k < size; k++){
                    if(
                            ((ary.get(i) + ary.get(j) + ary.get(k)) <= tar)
                            && ((ary.get(i) + ary.get(j) + ary.get(k)) > res)
                    ){
                        res = ary.get(i) + ary.get(j) + ary.get(k);
                    }
                }
            }
        }
        return res;
    }
}
