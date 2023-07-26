// Problem Link -> https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/

import java.util.*;
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String vowels = "AEIOUY";
        boolean flag = false;
        for(int i=0; i<str.length()-1; i++)
        {
            //System.out.println("Char->"+str.charAt(i)+"\tASCII->"+(int)str.charAt(i));
            if(str.charAt(i) == '-' || str.charAt(i+1) == '-')
                continue;
            else if(((int)str.charAt(i)) >= 65 || ((int)str.charAt(i+1)) >= 65)
            {
                if(vowels.contains(String.valueOf(str.charAt(i))))
                {
                    flag = true;
                    break;
                }
                else
                    continue;
            }
            else
            {
                String digit1 = String.valueOf(str.charAt(i));
                String digit2 = String.valueOf(str.charAt(i+1));
                int num1 = Integer.parseInt(digit1);
                int num2 = Integer.parseInt(digit2);
                //System.out.println("Count->"+(num1 + num2));
                if((num1 + num2) % 2 == 1)
                {
                    flag = true;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("invalid");
        else
            System.out.println("valid");
    }
}
