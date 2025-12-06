public interface A
{

void method1();{

System.out.println("present");
}

}

public interface B{

void method1();{
System.out.println("absent");
}


}

public class example1 implements A,B{
public static void main(String args){

example1 ex=new example1();


}

}