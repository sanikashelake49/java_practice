class Nokia1                //parent class
 {
   int mic;
int speaker;
int radio;

void setData()
 {
   System.out.println("child parent function 1 executed");
  }

void display()
{
  System.out.println("child parent functiom 2 executed");
  }

}


class Inherit
 {
  public static void main(String [] args)
  {
   //Nokia1 n1=new Nokia1();
   Nokia2 n2=new Nokia2();
n2.f1();
   //n1.f1();
}

}

class Nokia2 extends Nokia1        //child class 
{
  int sensor;
int music;
void f1()
 {
    System.out.println("child functiom 1 executed");
 }
void f2()
 {
 }
}