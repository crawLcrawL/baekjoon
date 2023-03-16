import java.io.*;

public class Honeycomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        if(n==1){
            bw.write("1");
        }

        //1번째 칸 = 1보다 작거나 같은 수
        //2번째 칸 = (1+6)보다 작거나 같은 수
        //3번째 칸 = (1+6+12)보다 작거나 같은 수
        //....

        else {
            int m = 1;
            int i = 1;
            do{
                m += (6*i);
                i += 1;
                cnt += 1;
            } while(n>m);

            bw.write(cnt+"");
        }

        bw.flush();
    }
}

