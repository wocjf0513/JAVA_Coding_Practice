import java.util.*;


public class Main{

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int count;
		if(str=="")
		count=0;
		else count=1;

		for(char c:str.toCharArray())
		{
			if(c==' ')
				count++;
		}
		System.out.print(count);
	}






}
