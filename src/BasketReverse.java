import java.io.*;
import java.util.*;
public class BasketReverse {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        int [] new_arr = new int[N];
        for (int a=0;a<N;a++){
            arr[a] = (a+1);
        }

        for(int k=0;k<M;k++){
            st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            for (int l=0;l<j-i+1;l++){
                System.out.println(l + " : *");
                new_arr[N-1-l] = arr[l];
            }
            //for (int t=0;t<N;tZ++){
            //  System.out.print(arr[t] + " ");
            //}
        }

        for(int b=0;b<N;b++){
            bw.write(arr[b] + " ");
        }

        bw.flush();
    }
}