//baekjoon 9063

import java.io.*;
import java.util.*;

public class AreaOftheEarth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] x_arr = new int[N];
        int[] y_arr = new int[N];

        for(int i=0;i<N;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            x_arr[i] = x;
            y_arr[i] = y;
        }
        Arrays.sort(x_arr);
        Arrays.sort(y_arr);

        int res = (x_arr[x_arr.length-1] - x_arr[0])*(y_arr[y_arr.length-1] - y_arr[0]);
        bw.write(res +"");
        bw.flush();

    }
}

