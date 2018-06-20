package codecheck;

public class App {


    public static void main(String[] args) {
        String[]base = new String[100];
        String modNum = null;
        String text = null;
        String input = null;
        String output = null;
        for (int i = 0, l = args.length; i < l; i++) {
            if (args[i].toString().contains(":")) {
                base = args[i].toString().split(":", 0);
                modNum = base[0].toString();
                text = base[1].toString();
                System.out.println(modNum);
                System.out.println(text);

            } else {
                input = args[i].toString();
                System.out.println(input);
            }

            //String output = String.format("argv[%s]: %s", i, args[i]);
            output = answer(modNum, text, input, output);
            System.out.println(output);
        }
        System.out.println(output);
    }

    public static String answer (String modNum, String text, String input, String output) {
        int modnum = Integer.parseInt(modNum);
        String str = text;
        int num = Integer.parseInt(input);
        String answer = output;
        System.out.println(modnum);
        System.out.println(str);
        if (num%modnum == 0) answer = answer.concat(str);
        System.out.println(answer);
        if (answer == null ) {
            return "";
        }
        else {
            return answer;
        }
    }



}
