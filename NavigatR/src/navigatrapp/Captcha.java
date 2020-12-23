package navigatrapp;

import java.util.*;
import java.util.Random;

public class Captcha {

	public static void main(String[] args) {
		Captcha t = new Captcha();
	    String captcha = t.getCaptcha();
	    System.out.println(captcha);
	    String input_captcha = t.inputCaptcha();
	    if (captcha.equals(input_captcha))
	    {
	    	System.out.println("Entered Captcha is correct");
	    }
	    else
	    {
	    	System.out.println("Entered Captcha is incorrect");
	    }
	}
	
	public String getCaptcha() {

	    char data[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
	            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
	            'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
	            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
	            'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6',
	            '7', '8', '9' };
	    char index[] = new char[7];

	    Random r = new Random();
	    int i = 0;

	    for (i = 0; i < (index.length); i++) {
	        int ran = r.nextInt(data.length);
	        index[i] = data[ran];
	    }
	    return new String(index);
	}
	
	public String inputCaptcha() {
		Scanner sc = new Scanner(System.in);
		String response = sc.next();
		sc.close();
		return response;
	}

}
