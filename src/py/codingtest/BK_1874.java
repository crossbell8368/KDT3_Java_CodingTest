package py.codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BK_1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ary = new ArrayList<>();
        ArrayList<String> act = new ArrayList<>();
        int size = Integer.parseInt(br.readLine());
        int tar = 1;

        for(int i = 0; i < size; i++){
            int num = Integer.parseInt(br.readLine());

            // push case
            while(tar <= num){
                ary.add(tar);
                act.add("+");
                tar += 1;
            }
            // pop case
            if(ary.get(ary.size()-1) == num){
                ary.remove(ary.size()-1);
                act.add("-");
            }else{
                System.out.println("NO");
                System.exit(0);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : act) {
            sb.append(s);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
