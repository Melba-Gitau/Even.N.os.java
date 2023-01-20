import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int [] arr = new int[5];
	    System.out.println("Enter your numbers:");
	    //initialize the even and odd
	        int even = 0;
	        int odd = 0;
	    for (int i = 0; i < arr.length;i++){
	        arr[i]= sc.nextInt();
	        //condition if even or not
	        if(arr[i] %2 == 0){
	            even += arr[i];
	        }else{
	            odd += arr[i];
	        }
	    }
		System.out.println("The sum of even numbers is: " + even);
		System.out.println("The sum of odd numbers is: " + odd);
	}
}
