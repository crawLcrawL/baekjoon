import java.io.*;
import java.util.*;
public class Remainder {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr = new int[10];
        int cnt = 1;

        for(int i=0;i<10;i++){
            arr[i] = (Integer.parseInt(br.readLine()))%42;
        }
        Arrays.sort(arr);

        for (int i=0;i<9;i++){
            if(arr[i+1]-arr[i]==0)
                cnt += 0;
            else
                cnt += 1;
        }
        bw.write(cnt+"");
        bw.flush();
    }
}