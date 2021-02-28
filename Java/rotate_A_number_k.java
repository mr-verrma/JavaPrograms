package Java;

public class rotate_A_number_k {
	static int numberOfDigit(int N)
	{
		int digit = 0;
		while (N > 0) {
			digit++;
			N /= 10;
		}
		return digit;
	}
	static void rotateNumberByK(int N, int K)
	{

		// Stores count of digits in N
		int X = numberOfDigit(N); 

		// Update K so that only need to
		// handle left rotation
        K= K % X ; //greater than no of digits
        if(K < 0){
            K = K + X;
        }  

		// Stores first K digits of N
		int left_no = N / (int)(Math.pow(10,X - K));

		// Remove first K digits of N
		N = N % (int)(Math.pow(10, X - K));

		// Stores count of digits in left_no
		int left_digit = numberOfDigit(left_no);

		// Append left_no to the right of
		// digits of N
		N = (N * (int)(Math.pow(10, left_digit)))+ left_no;

		System.out.println(N);
	}

	// Driver Code
	public static void main(String args[])
	{

		int N = 12345, K = 7;

		// Function Call
		rotateNumberByK(N, K);
	}
}

