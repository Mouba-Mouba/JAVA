public class Strings{
	public static void main(String[] args){
		/*
		- In Java, a string is a sequence of characters.
		- Creating a String
		*/

		String s1 = "Hello!";
		
		/*
		String Methods

		Methods		Description

		concat()		joins the two strings together
		equals() 		compares the value of two strings
		charAt()		returns the character present in the specified location
		getBytes()		converts the string to an array of bytes
		indexOf()		returns the position of the specified character in the string
		length()		returns the size of the specified string
		replace()		replaces the specified old character with the specified new character
		substring()		returns the substring of the string
		split(" ")		breaks the string into an array of strings
		toLowerCase()	converts the string to lowercase
		toUpperCase()	converts the string to uppercase
		valueOf()		returns the string representation of the specified data
		*/

		// Examples

		// create a string
	    String greet = "Hello! World";
	    System.out.println("The string is: " + greet);

	    //checks the string length
	    System.out.println("The length of the string: " + greet.length());

	    /*
	    OUTPUT
	    The string is: Hello! World
		The length of the string: 12
	    */

	    // Join Strings

	    // create string
	    String greet = "Hello! ";
	    System.out.println("First String: " + greet);

	    String name = "World";
	    System.out.println("Second String: " + name);

	    // join two strings
	    String joinedString = greet.concat(name);
	    System.out.println("Joined String: " + joinedString);

	    /*
	    OUTPUT
	    First String: Hello!
		Second String: World
		Joined String: Hello! World
	    */



	    // create string
	    String greet = "Hello! ";
	    System.out.println("First String: " + greet);

	    String name = "World";
	    System.out.println("Second String: " + name);

	    // join two strings
	    String joinedString = greet + name;
	    System.out.println("Joined String: " + joinedString);

	    /*
	    OUTPUT
	    First String: Hello!
		Second String: World
		Joined String: Hello! World
	    */

	    // Get char at
	    // create string using the string literal
	    String greet = "Hello! World";
	    System.out.println("The string is: " + greet);

	    // returns the character at 3
	    System.out.println("The character at 3: " + greet.charAt(3));

	    // returns the character at 7
	    System.out.println("The character at 7: " + greet.charAt(7));

	    /*
	    OUTPUT
	    The string is: Hello! World
		The character at 3: l
		The character at 7: W
	    */



	    // Others

	    // create string using the new keyword
	    String example = new String("Hello! World");

	    // returns the substring World
	    System.out.println("Using the subString(): " + example.substring(7));

	    // converts the string to lowercase
	    System.out.println("Using the toLowerCase(): " + example.toLowerCase());

	    // converts the string to uppercase
	    System.out.println("Using the toUpperCase(): " + example.toUpperCase());

	    // replaces the character '!' with 'o'
	    System.out.println("Using the replace(): " + example.replace('!', 'o'));

	    /*
		OUTPUT
		Using the subString(): World
		Using the toLowerCase(): hello! world
		Using the toUpperCase(): HELLO! WORLD
		Using the replace(): Helloo World
	    */

	    // Escaping characters
	    // use the escape character
		String example = "This is the \"String\" class.";
	}
}