import java.io.*;
import java.util.*;
public class WordFrequency {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        str = str.toUpperCase();
        char[] arr = str.toCharArray();
        int[] n_arr = new int[27];

        int max = 0;
        int max_index=0;
        String q = "0";

        for(int i=0;i<str.length();i++){
            for(int j=0;j<26;j++){
                if(arr[i]==(char)(j+65)) {
                    n_arr[j] += 1;

                    if(n_arr[j]>max){
                        q="0";
                        max=n_arr[j];
                        max_index = j;
                    }
                    else if(n_arr[j]==max){
                        q = "?";
                        break;
                    }
                }
            }
        }
        if(q != "?") {
            bw.write((char)(65+max_index));
        }
        else
            bw.write("?");
        bw.flush();

    }
}
