import java.util.*;

public class StringModify{
public static void main(String[] args){
	String s1 = "Let's URLify this String";
	System.out.println(stringModifier(s1));
}
public static String stringModifier(String inp){
	for(int i =0;i<inp.length();i++){
		if(inp.charAt(i)==(int)32){
			inp = inp.substring(0,i)+"%20"+inp.substring(i+1,inp.length());
			i+=2;			
}
}
	return inp;
}
}