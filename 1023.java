import java.util.*;




class Main{

	public static void main(String args[]){

		Stack<Integer> stack=new Stack<>();
		int temp=0;
		while(true){
			if(gernerator(temp)<=10000)
				stack.push(gernerator(temp));
			else
				break;

			temp++;
		}
		
		for(int i=1; i<=10000; i++){
			if(stack.search(i)==-1)
				System.out.println(i);
	}

	}

	public static int gernerator(int source){

		int result_num=source;
		String s=Integer.toString(source);
		for(char a:s.toCharArray()){
			result_num+=a-'0';
		}
		return result_num;
	}


}
