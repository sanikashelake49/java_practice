
public class StuMain {

	public static void main(String[] args) {
		
		StudentData std1=new StudentData(1,"rushi",99,95);
		// TODO Auto-generated method stub
		
		StuProcess sp=new StuProcess();
		
		sp.showResult(std1);
		
		  
		
		System.out.println("Total Mark :"+sp.getTot(std1));
		
		System.out.println("Average;"+sp.getAvg(std1));
		
	   // System.out.println("Result Status:"+sp.getResult(std1));
	    
	    System.out.println("Grade is :"+sp.getGrade(std1));

	}

}
