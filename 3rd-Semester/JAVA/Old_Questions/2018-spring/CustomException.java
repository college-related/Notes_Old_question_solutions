import java.io.*;

class CustomException extends Exception {
	CustomException(String message){
		super(message);
	}
}

class test {
	public static void main(String[] args) {
		try
		{
			throw CustomException("Custom Exception Error");
		}
		catch(CustomException e){
			System.out.println(e);
		}
	}
}