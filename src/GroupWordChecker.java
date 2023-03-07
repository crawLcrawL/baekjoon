import java.io.*;

public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int groupword = 0;
        boolean bool = true;

        for(int i=0;i<N;i++){
            String word = br.readLine();
            char [] word_arr = word.toCharArray();
            if(word_arr.length <= 2){
                groupword += 1;
            }

            else{
                for(int j=0;j<N;j++){
                    for(int k=j+1;k<N-j;k++){
                        if( word_arr[j] == word_arr[k-1]) {
                            if (k - 1- j == 1) {
                                bool = true;
                            }
                            else
                                bool = false;
                        }
                    }
                }
                if(bool == true)
                    groupword += 1;
                else
                    break;
            }
        }

        System.out.println(groupword);

    }
}

