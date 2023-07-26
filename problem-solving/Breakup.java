// Problem link-> https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/breakup-app/

import java.util.Scanner;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int on19 = 0;
        int on21 = 0;
        String str = "";
        String[] msg = new String[2];
        for (int i = 0; i < N; i++) {
            str = sc.nextLine();
            msg = str.split(":");
            if(msg[0].equals("G")){
                if(msg[1].contains("19"))
                    on19 = on19 + 2;
                if(msg[1].contains("21"))
                    on21 = on21 + 2;
            }
            else if(msg[0].equals("M")){
                if(msg[1].contains("19"))
                    on19++;
                if(msg[1].contains("21"))
                    on21++;
            }
        }
        String date = on19 > on21 ? "Date" : "No Date"; 
        System.out.println(date);
    }
}
