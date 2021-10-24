import java.util.*;


public class Main{

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		long[] input=new long[3];
		
		for(int i=0; i<3; i++)
			input[i]=in.nextLong();

		if(input[0]>0&&input[1]==input[2])
		System.out.print(-1);

		if(input[1]>input[2])
		System.out.print(-1);

		int count=0;

		while(true){
			if(input[0]+count*input[1]<count*input[2])
				break;
			count++;
		}
		System.out.print(count);
	}







}
