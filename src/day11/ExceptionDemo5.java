package day11;

/*
 * 程序功能:异常---finally代码块
 * 程序员:魏国平
 * 编写时间:11月12日
 */

/*
 * 
 */

class Demo5
{
	public int show(int index)
	{
		if(index < 0)
			throw new ArrayIndexOutOfBoundsException("越界啦");
		int [] arr = new int[3];
		return arr[index];
	}
}

public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d = new Demo5();
		try {
			int num = d.show(-3);
			System.out.println("num = " + num);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			return;//直接结束了程序
		}
		finally//finally是一点定会执行的代码
		{
			System.out.println("finally");
		}
		System.out.println("over");
	}

}
