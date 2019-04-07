import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    int n=s1.length();
	    int m=s2.length();
	    int i;
	    if(n>m){
	        System.out.println(s1);
	  }
	  if(m>n){
	      System.out.println(s2);
	  }
	   else
	   System.out.println(s1);
	     
}
}
