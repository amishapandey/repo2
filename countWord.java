import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int count=0,i;
		for(i=0;i<str.length();i++){
	       if(arr[i]=" ")
	       count++;
	    }
		
		System.out.println(count);
	}

}
