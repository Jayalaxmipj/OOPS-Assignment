package book_details;

import java.util.Scanner;

public class EnggTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enggbook bk=new enggbook();
		Scanner sb=new Scanner(System.in);
		System.out.println("enter book number");
		bk.setBookNo(sb.nextInt());
		System.out.println("enter book title");
		bk.setTitle(sb.nextLine());
		System.out.println("enter book author");
		bk.setAuthor(sb.nextLine());
		System.out.println("enter book price");
		bk.setPrice(sb.nextFloat());
		System.out.println("enter book category");
		bk.setCategory(sb.nextLine());
		
		
		System.out.println(bk);
		
	}

}
