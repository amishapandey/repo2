import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int i;
	    char[] arr=str.toCharArray();
	    for(i=arr.length-1;i>=0;i--)
	    {
	        System.out.print(arr[i]);
	   }
	 }
}
