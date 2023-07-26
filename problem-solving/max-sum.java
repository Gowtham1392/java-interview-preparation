// Problem link -> https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/maximum-sum-4-f8d12458/

import java.util.*;
import java.util.Arrays;
class TestClass {
public static void main(String args[] ) throws Exception {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
long arr[] = new long[t];
long ans = 0;
int count =0;
for(int i =0;i<t;i++)
{
arr[i] = s.nextLong();
if(arr[i] >= 0)
{
ans = ans + arr[i];
count = count +1;
}
}
if(ans == 0)
{
Arrays.sort(arr);
System.out.println(arr[t-1] +" "+"1");
}
else
{
System.out.println(ans +" "+count);
}
}
}
