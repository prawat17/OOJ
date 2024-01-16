import java.util.Arrays;

public class Strings174 {
    int a;

    Strings174(int a) {
        this.a = a;
    }

    public String toString() {
        return "The value is: " + a;
    }

    public static void main(String args[]) {
        // There are 3 String Constructors
        String s1 = new String("Navneeth KS");
        String s2 = new String(s1);
        char c[] = {'a', 'b', 'c', 'd'};
        String s3 = new String(c);

        // string length, string literal, string concat
        System.out.println(s1.length()); // Corrected from s1.lenght() to s1.length()
        String str = "Hello";
        str = str + " World"; // Concatenation corrected

        // getChars method
        s1 = "Welcome to Bmsce College";
        char targetArray[] = new char[4];
        s1.getChars(0, 4, targetArray, 0);
        System.out.println(targetArray);

        // toCharArray method
        char[] charArray = s1.toCharArray();

        // getBytes
        System.out.println(Arrays.toString(s1.getBytes()));

        // Equals
        String a1 = "Bmsce";
        String a2 = "Bmsce";
        String a3 = "College";
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a1.equalsIgnoreCase(a2));

        // RegionMatches
        System.out.println(s1.regionMatches(true, 7, "to", 0, 2));

        // Starts with and Ends with
        System.out.println(s1.startsWith("Welcome")); // Corrected from s1.startwith("Welcome") to s1.startsWith("Welcome")
        System.out.println(s1.endsWith("College")); // Corrected from s1.endswith("Welcome") to s1.endsWith("College")

        // == method
        System.out.println(s1 == s2);

        // Write a java program to perform sorting for alphabets using compareTo()
        String[] words = {"van", "watch", "ball", "cat", "xmas", "yatch", "zee", "apple", "ice", "jug", "kite",
                "lift", "man", "net", "orange", "dog", "ent", "free", "gun", "hen", "parrot", "queen", "ring",
                "star", "tree", "umbrella"};
        Arrays.sort(words, (s1a, s2a) -> s1a.compareTo(s2a));
        System.out.println("Sorted Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Replace methods
        s1 = s1.replace("to", "is"); // Assign the result back to s1

        // Trim
        String ss = "              Hello World         ";
        ss = ss.trim(); // Assign the result back to ss

        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        // setLength()
        System.out.println("Original StringBuffer: " + stringBuffer);
        stringBuffer.setLength(5);
        System.out.println("After setLength(5): " + stringBuffer);

        // charAt()
        System.out.println("charAt(1): " + stringBuffer.charAt(1));

        // setCharAt()
        stringBuffer.setCharAt(1, 'E');
        System.out.println("After setCharAt(1, 'E'): " + stringBuffer);

        // getChars()
        charArray = new char[5];
        stringBuffer.getChars(0, 5, charArray, 0);
        System.out.println("getChars(0, 5, charArray, 0): " + new String(charArray));

        // append()
        stringBuffer.append(" - Greetings!");
        System.out.println("After append(\" - Greetings!\"): " + stringBuffer);

        // insert()
        stringBuffer.insert(6, " New");
        System.out.println("After insert(6, \" New\"): " + stringBuffer);

        // reverse()
        stringBuffer.reverse();
        System.out.println("After reverse(): " + stringBuffer);

        // delete()
        stringBuffer.delete(6, 10);
        System.out.println("After delete(6, 10): " + stringBuffer);

        // deleteCharAt()
        stringBuffer.deleteCharAt(5);
        System.out.println("After deleteCharAt(5): " + stringBuffer);

        // replace()
        stringBuffer.replace(0, 5, "Hola");
        System.out.println("After replace(0, 5, \"Hola\"): " + stringBuffer);

        // substring()
        String substring = stringBuffer.substring(2, 7);
        System.out.println("substring(2, 7): " + substring);
    }
}
