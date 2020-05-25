import java.util.*;
import java.io.*;

class javaLoops2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
	    compute(a,b,n);
        }
        in.close();
    }

    public static int pow(int exp, int b){
	   int result =1;
	   if (0 == exp)
		   return b*result;
	   else {
		   int counter=0;
		   while (counter <exp){
			   result = result* 2;
			   counter++;
		   }
		   return result*b;
	   }
		   
    }
    public static void compute(int a, int b, int n){
	   int counter=0;
	   int result = 0;
	   while (counter <n){
		   if (0 == counter) {
		   	result = result + a + pow(counter,b);
		   	System.out.printf("%d",result);
		   } else {
			result = result + pow(counter,b);
		   	System.out.printf(" %d",result);
		   }
		   ++counter;
	   }
	   System.out.printf("%n");
    }
    public static void testpow(int a, int b, int n){
	    int res=pow(n,b);
	    System.out.println(res);
	    compute(a,b,n);
    }
}
