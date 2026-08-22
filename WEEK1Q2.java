 import java.util.Scanner;

class WEEK1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch + 1);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 1);
            }

            result = result + ch;
        }

        System.out.println("Encrypted word: " + result);

        sc.close();
    }
}
    
}
