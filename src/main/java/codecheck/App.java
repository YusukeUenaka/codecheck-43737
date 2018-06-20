package codecheck;

public class App {

    private static String  answer = null;
    public static void main(String[] args) {
        String[]base = new String[100];
        String modNum = null;
        String text = null;
        String input = null;
        for (int i = 0, l = args.length; i < l; i++) {
            if (args[i].toString().contains(":")) {
                base = args[i].toString().split(":", 0);
                modNum = base[0].toString();
                text = base[1].toString();
            } else {
                input = args[i].toString();
            }

            //String output = String.format("argv[%s]: %s", i, args[i]);
            output = answer(modNum, text, input);
        }
        System.out.println(output);
    }

    public static String answer (String modNum, String text, String input) {
        String monnum = modNum;
        String str = text;
        String num = input;
        if (num%modnum == 0) {
            answer += str;
        }
        return answer;
    }



}
