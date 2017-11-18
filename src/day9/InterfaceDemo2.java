package day9;

/*
 * 程序功能:接口和抽象类的区别
 * 程序员:魏国平
 * 编写时间:11月9日
 */

/*
 * 抽象类和接口的异同点
 * 
 * 相同点：
 * 	都是不断向上抽取而来的
 * 
 * 不同点
 * 	1.抽象类需要被继承，而且只能单继承。
 * 	  接口需要被实现，而且可以多实现。
 * 	2.抽象类中可以定义抽象方法和非抽象方法，子类继承后，可以直接使用非抽象方法。
 * 	  接口中只能定义抽象方法，必须由子类去实现。
 * 	3.抽象类的继承，是is a 关系，在定义该体系的基本共性内容。
 * 	   接口的实现是like a关系，在定义体系额外功能。
 * 	
 * 
 * 犬按功能分：导盲犬，搜爆犬
 * 
 * interface 犬
 * {
 * 		//不确定怎样吼叫所以用抽象方法
 * 		abstract void 吼叫();
 * }
 * 
 * interface 导盲
 * {
 * 		abstract void 吼叫();
 * }
 * 
 * class 导盲犬 extends 犬
 * {
 * 		public void 吼叫()
 * 		{
 * 		}
 * 		public void 导盲()
 * 		{
 * 		}
 * }
 */
class InterfaceDemo2
{
	
}
