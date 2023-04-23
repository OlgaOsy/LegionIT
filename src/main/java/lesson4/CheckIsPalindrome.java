package lesson4;

public class CheckIsPalindrome {
    public static void main(String[] args) {
        CheckIsPalindrome checkIsPalindrome = new CheckIsPalindrome();
        System.out.println(checkIsPalindrome.isPalindrome("madamadam"));
    }



        public boolean isPalindrome(String text){

        int a = text.length() - 1;
        int b = 0;
            if (text.charAt(a) == text.charAt(b)){
            return true;
            }
            else
            return false;
        }

    }

