import java.util.Arrays;
import java.util.Random;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor1
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //By default size is 16
		
		//Constructor2
		StringBuffer sb2 = new StringBuffer("Kunal Kushwaha");
		
		//Constructor3
		StringBuffer sb3=new StringBuffer(30); // customized size by user
		System.out.println(sb3.capacity());
		
		sb.append("WeMakeDevs");
		sb.append(" is nice!");
		
		//System.out.println(sb);
		
		String str=sb.toString();
		System.out.println(str);
		
//		Random random = new Random();
//		System.out.println(random.nextFloat());
//		
//		System.out.println((char)(97 + 1));
		
		String name = RandomString.generate(20);
		System.out.println(name);
		
		String sentence = "Hi h nbv   asdf  assdd";
		System.out.println(sentence);
		
//		The replaceAll() method returns a new string, which is "Hihnbvasdfassdd", where all the whitespace has been removed.
//		This new string is created temporarily by the replaceAll() method and is not stored in any variable since it's used directly in the System.out.println() statement.
		
		System.out.println(sentence.replaceAll("\\s",""));
		
		//System.out.println(sentence);
		
		sentence = sentence.replaceAll("\\s","");
		System.out.println(sentence);
		
		
		
		String str1 = "Kunal,apporv,Rahul,Snehal";
		String[] names = str1.split(",");
		System.out.println(Arrays.toString(names));
		
		
		
		
		
		
		
		
		
		

	}

}
