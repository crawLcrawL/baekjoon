import java.io.*;
import java.util.*;

public class ScoreAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for(int i=0;i<C;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int [] score = new int[N];
            int sum=0;
            for(int j=0;j<N;j++){
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }

            double average = (double)sum / N;
            int count = 0;

            for(int k=0;k<N;k++){
                if(score[k] > average){
                    count+=1;
                }
            }
            double cnt1 = Double.valueOf(count);
            double num1 = Double.valueOf(N);
            System.out.printf("%.3f%%\n", (cnt1/num1)*100);
        }

    }
}