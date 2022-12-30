package boj.roof;

import java.io.*;

public class R_9_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                bw.write(" ");
            }
            for(int k=1;k<=i;k++){
                bw.write("*");
            }

            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
