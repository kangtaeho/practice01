package practice01;

public class Prob5_2 {

	public static void main(String[] args) {
		
		String[] str = new String[5]; //배열선언과 생성 → str과 String[5] 연결(문자열)
		
		int[] i ={110,3,5,7}; //배열의 초기화 → int형 배열인 변수 i를 생성하고 배열의 길이는 괄호의 값의 갯수에 맞춰서 생성됨.(바로 값이 안에 들어가 있어 바로 초기화)
		
		
		str[0]="10";
		str[1]="20";
		str[2]="30";
		str[3]="40";
		str[4]="50";
		
		System.out.println("str[0]과 i[0]를 더하면? : "+ (str[0]+i[0]));
		System.out.println("");
		System.out.println("srt변수의 배열 길이 : "+ str.length+"\n");
		//System.out.println("i[0]의 길이 : "+i[0].length()); //잘못된 식 : length()는 배열의 길이를 알려주는 식? (뭐라고하지?) 객체?이다
		
		//문자열을 숫자열로 바꾸는 방법
		int strNum = Integer.parseInt(str[0]);
		System.out.println("strNum과 i[0]를 더하면? : "+ (strNum+i[0])+"\n");
		//System.out.println("strNum의 길이는 ? : " + strNum.length()); //이것 역시 잘못된 식이다 : length()는 배열의 길이를 알려주는 
		
		//숫자열를 문자열로 바꾸는 방법
		String iStr = String.valueOf(i[0]);
		System.out.println("strNum과 iStr를 더하면? : "+ (strNum+iStr));
		System.out.println("iStr(변경된i[0])의 길이 : "+iStr.length()); //String은 연속된 char들의 집합이므로 배열에 속한다. 그래서 길이를 알 수 있음
		System.out.println("iStr.charAt(0)출력 : "+ iStr.charAt(0));//charAt(순서)는 해당된 순서의 문자열을 출력하는 기능을 가지고 있다.
		System.out.println("iStr.charAt(2)출력 : "+ iStr.charAt(2)+"\n");
		
		//args사용
		System.out.println("args에 5579를 넣고 args[0]를 출력 : " + args[0]);//생각대로면 맨앞의 수인 5만 출력 될줄 알았지만 그냥 다출력됨..(이유는 모르겠음)
		int argNum = Integer.parseInt(args[0]); //보통 args의 값이 문자열이기 때문에  Interger.parseInt를 이용하여 숫자로 변경한 후 사용을 많이 하는 거 같음(내 생각임..)

	}

}
