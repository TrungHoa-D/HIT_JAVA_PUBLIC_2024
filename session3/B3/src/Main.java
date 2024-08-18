import java.util.Scanner;

public class Main {
    public static int n;
    public static final int HOURS_IN_DAY = 24;
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.pow(2,10));
//        int ran= (int)(Math.random()*100);
//        System.out.println(ran);
//        String firstName= "John";
//        String lastName= "Smith";
//        String fullName= firstName+" "+lastName;
//        String fullNameConcat = firstName.concat(" ").concat(lastName);
//        System.out.println(fullName);
//        System.out.println(fullNameConcat);
//        System.out.println(fullName.equals(fullNameConcat));
//        String str1 ="Hello";
//        boolean areEqualIgnoreCase = str1.equalsIgnoreCase("HELLO");
//        System.out.println(str1.length());
//        String sentence = "Java programming is fun and powerful.";
//        String subString = sentence.substring(5, 16);
//        System.out.println(subString);
//        int indexOfFun = sentence.indexOf("How");
//        System.out.println(indexOfFun);
//        String originalText = "I like apples and apples are tasty.";
//        System.out.println(originalText);
//        String replacedText = originalText.replace("apples", "bananas");
//        System.out.println(replacedText);
//        originalText=originalText.toUpperCase();
//        System.out.println(originalText);
//        originalText=originalText.toLowerCase();
//        System.out.println(originalText);
//        String message = "Hello, Java programming.";
//        boolean startsWithHello = message.startsWith("Hell");
//        System.out.println(startsWithHello);
//        System.out.println(message.contains("pro"));
//        System.out.println("'"+message.charAt(6)+"'");
//        System.out.println(message.codePointAt(6));
//        char a='A';
//        System.out.println(a+", "+(char)(a+32));
        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();sc.nextLine();
//        String b= sc.nextLine();
//        System.out.println("a: "+a+"\n"+"b: "+b+"\n");
        int a= (int) (Math.random()*100)%11;
        int b= (int) (Math.random()*100)%11;
        int c= (int) (Math.random()*100)%21;
        int w= (int) (Math.random()*10)%2;
        if(w==0) c=a+b;
        System.out.println(a+" + "+b+" = "+c);
        System.out.print("Phép tính trên đúng hay sai (Y/N):");
        char x= sc.nextLine().charAt(0);
        if(a+b==c) {
            if(x=='Y') {
                System.out.println("Chính xác!");
            }
            else if(x=='N') {
                System.out.println("Sai!");
            }
        }
        else{
            if(x=='Y') {
                System.out.println("Sai!");
            }
            else System.out.println("Chính xác!");
        }
    }

}