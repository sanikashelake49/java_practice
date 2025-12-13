package mypackage;

//import mypackage.A;
 interface A
{
 void test();
}
 interface B
{
  int test();
}
public class Test implements A , B
 {
    public void test()
      {
        System.out.println("method implementation");
       }
    public int test()
      {
         return 0;
         }

   public static void main(String[]args)
     {
       Test t1=new Test();
	t1.test();
      }


}
 
