class Converstion_StringBuffer_and_StringBuilder_to_String{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("SB");
		StringBuilder sbdr = new StringBuilder("SBuilder");

		//conversion from StringBuffer  to String
		String str = sb.toString();
		System.out.println("Conversion from StringBuffer to String: ");
		System.out.println(str);

		//conversion from  StringBuilder to String
		String str1 = sbdr.toString();
		System.out.println("Conversion from StringBuilder to String: ");
		System.out.println(str1);

		//Changing in StringBuffer not in String

		sb.append("Add_to_StringBuffer");
		System.out.println(sb);
		System.out.println(str);
	}
}