import java.io.*;
import java.util.*;
public class ColoredPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [][] sketch = new int[100][100];

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) ;
            int y = Integer.parseInt(st.nextToken()) ;


            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    sketch[j][k] += 1;
                }
            }
        }

        int cnt = 0;
        for(int a=0;a<100;a++){
            for(int b=0;b<100;b++){
                if(sketch[a][b] >= 2){
                    cnt += (sketch[a][b] - 1);
                }

            }
        }

        int res = n*100 - cnt;
        bw.write(res + "");
        bw.flush();
    }

}


