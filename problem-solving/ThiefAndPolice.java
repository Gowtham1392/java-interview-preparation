// Problem link-> https://www.hackerearth.com/problem/algorithm/joker-and-thieves-53e59f4a/?source=list_view

import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            char[][] A = new char[N][N];
            for(int i_A=0; i_A<N; i_A++)
            {
            	String[] arr_A = br.readLine().split(" ");
            	for(int j_A=0; j_A<arr_A.length; j_A++)
            	{
            		A[i_A][j_A] = arr_A[j_A].charAt(0);
            	}
            }
 
            int out_ = solution(A, K);
            System.out.println(out_);
            System.out.println("");
         }
 
         wr.close();
         br.close();
    }
    static int solution(char[][] A, int K){
        int maxTraversal = 0;
        int arrLen = A.length;
        List<String> caughtList = new ArrayList<String>();
         
        for(int i = 0; i < arrLen; i++){
            for(int j = 0; j < arrLen; j++){
                int forward = 1;
                int backward = 1;
                String str = "";
                //System.out.println(""+i+j+"-->"+A[i][j]);
                if(A[i][j] == 'P'){
                    int intialSize = caughtList.size();
                    int caught = intialSize;
                    //System.out.println("j - backward ==>"+backward+" FWD=>"+forward);
                    if((j - backward) >= 0 && A[i][j - backward] == 'T'){
                        //System.out.println("++BC++");
                        str = ""+i+(j - backward);
                        //System.out.println("SB->"+str);
                        //System.out.println("Item present? "+caughtList.contains(str));
                        if(!caughtList.contains(str)){
                            caughtList.add(str);
                            caught = caughtList.size();
                            //System.out.println("--BC--");
                        }
                        backward++;
                        continue;
                    }
                    if((intialSize == caught) && (j + forward) < arrLen && A[i][j + forward] == 'T'){
                        //System.out.println("++FW++");
                        str = ""+i+(j + forward);
                        //System.out.println("SB->"+str);
                        if(!caughtList.contains(str)){
                            caughtList.add(str);
                            //System.out.println("--FW--");
                        }
                        forward++;
                    }
                }
                //System.out.println("Array = "+Arrays.toString(caughtList.toArray()));
                //System.out.println("==========================================================");
            }
            
        }
        return caughtList.size();
    }
}
