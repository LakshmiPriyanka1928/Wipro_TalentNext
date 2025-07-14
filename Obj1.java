import java.util.*;
class Obj1{
	int width;
	int height;
	int depth;
	Obj1(){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obj1 box=new Obj1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		int width=sc.nextInt();
		int height=sc.nextInt();
		int depth=sc.nextInt();
		int volume=width*height*depth;
		System.out.println("Volume of a box "+volume);
		

	}

}