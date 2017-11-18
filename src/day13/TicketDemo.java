package day13;

/*
 * 程序功能:卖票实例
 * 程序员:魏国平
 * 编写时间:11月17日
 */

/*
 * 需求：卖票
 */

class Ticket implements Runnable //extends Thread
{
	private int num = 100;
	
	public void run()
	{
		sale();
	}
	
	public void sale()
	{
		while(true){
			//因为在现实中的售票是没有出现负票的情况的
			if(num > 0)
			{
				try {
					Thread.sleep(10);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
			}
		}
	}
}

public class TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
		
		Ticket t = new Ticket();//创建一个线程任务对象(这个卖火车票的)
		Ticket tt = new Ticket();//创建一个线程任务对象(这个卖动车票的)
		
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
