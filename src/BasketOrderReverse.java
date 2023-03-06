import java.io.*;
import java.util.*;

public class BasketOrderReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] basket = new int[N];
        int[] final_basket = basket;
        for (int i=0;i<N;i++){
            basket[i] = (i+1);
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int mid = Integer.parseInt(st.nextToken());

            int[] new_basket1 = Arrays.copyOfRange(final_basket,begin-1,mid-1);
            int[] new_basket2 = Arrays.copyOfRange(final_basket,mid-1,end);
            System.out.println(Arrays.toString(new_basket1));
            System.out.println(Arrays.toString(new_basket2));

            int len1 = new_basket1.length;
            int len2 = new_basket2.length;

            for(int j=0;j<N;j++){
//                if(j<begin-1){
//                    break;
//                }
                if (j>=begin-1 && j<end){
                    System.arraycopy(new_basket2,0,final_basket,j,len2+j-1);
                    System.arraycopy(new_basket1,0,final_basket,len2+j-1,len1+j-1);
                }
//                else if(j>end){
//                    break;
//                }
            }

            System.out.println(Arrays.toString(final_basket));


        }
    }
}