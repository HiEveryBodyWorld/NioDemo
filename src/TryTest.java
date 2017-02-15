
public class TryTest {

	public static void main(String[] args) {
		
		TryTest tt = new TryTest();
		
		System.out.println(tt.tryCatchTest());

	}

	
	public String tryCatchTest(){
		try{
			
			int[] i = new int[2];
			System.out.println(i[4]);
			
		}catch(Exception e){
			System.out.println("catch");
		}
		return "Helleo";
	}
}
