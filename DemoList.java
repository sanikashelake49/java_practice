import java.util.*;

class DemoList
{
  public static void main(String []args)
   {
     ArrayList<Integer> al=new ArrayList<>();  //generic :wrapper class(Integer)
    
   Integer i = 25;  
   al.add(10);                           //elements adding into the list
     al.add(20);
    al.add(30);
  al.add(2,40);
  
            System.out.println(al.toString());                            // when we write al then toString method get automatically overidden if we dont write then also
   //  System.out.println(i.toString());
      //System.out.println("printing all elements in an object "+al);     //printing all elements by using object that is *toString* method

   //another method to print object

  for(Integer s:al)                                                     //print each element separately
      System.out.println(s);

//   System.out.println(" size of an list "+al.size());             //getting size of an list
  //System.out.println("match or not "+al.contains(10));           //matching to the elements and returns true or false


}
}
   




//when we create our own class then toString method must be write but for wrapper classes when we create an object it will get automatically called no need to write