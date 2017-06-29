import java.util.Scanner;


public class least {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		    int[] times = new int[10];
		    while(n!=0) {
		        if(n==0)
		        {
		         break;
		        }
		        int val=n%10;
		        times[val]++;
		        n/=10;
		    }
		    String str ="";
		    for (int i=9;i>=0;i--) {
		        for (int j=0;j<times[i];j++) {
		            str+=i;
		        }
		    }
		    
		    System.out.println("Enter the kth value:");
		    int k=s.nextInt();
		    String s1=str.substring(k,str.length());
		    int b=Integer.parseInt(s1);
		    System.out.println("The Least number is:");
		    while(b>0){
		    	int x=b%10;
		    	b=b/10;
		    
		    System.out.print(x);
		    }
}
}
