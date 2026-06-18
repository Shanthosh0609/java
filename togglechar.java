import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("word:");
        String input = sc.nextLine();
        String toggled = ""; r
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                toggled += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                toggled += Character.toUpperCase(ch);
            } else {
                toggled += ch;
            }
        }
        
        System.out.println("Original: " + input);
        System.out.println("Toggled:  " + toggled);
        
        sc.close();
    }
}

