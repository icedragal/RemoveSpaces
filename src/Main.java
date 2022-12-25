public class Main {
    public static void main(String[] args) {
        String str = "   dsada                           sad ddasdd  d      ddd";
        System.out.println(str);
        System.out.println(removeSpaces(str));
    }
    public static String removeSpaces(String str){
        return str.replaceAll(" ", "");
    }
}