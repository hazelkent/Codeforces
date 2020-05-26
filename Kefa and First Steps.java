import java.util.*;
import java.math.BigInteger; 

public class Cp{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args){
	int t = sc.nextInt();
	int ar[] = new int[t];
	for(int i = 0 ; i < t; i++){
		ar[i] = sc.nextInt();
	}
	int mx = ar[0];
	int cnt = 1;
	int hld = 0;
	for(int i = 1 ; i < t; i++){
		if(ar[i]>=mx){
			mx = ar[i];
			cnt++;
		}
		else if(ar[i] < mx){
			if(cnt>=hld){
				hld = cnt;
			}
			cnt = 1;
			mx = ar[i];
		}
	}
		if(cnt >= hld)
		System.out.print(cnt);
		else
		System.out.print(hld);
	
}
}
