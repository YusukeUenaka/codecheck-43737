package codecheck;

public class App {


    public static void main(String[] args) {
        String[] base = null;
        String[] str = null;
        int modNum = 0;
        String text = null;
        int input = 0;
        String output = null;
        //String output = String.format("argv[%s]: %s", i, args[i]);
        for (int i = 0, l = args.length; i < l; i++) {
            if (!args[i].toString().contains(":")) {
                input = Integer.parseInt(args[i].toString());
                System.out.println(input);
            } else {
                base = args[i].split(":", 0);
                if (!base[i+1].isEmpty()) {
                    str[i] = base[i + 1];
                }
            }
        }
        for (int i = 0, l = base.length; i < l-1; i++) {
            modNum = Integer.parseInt(base[i].toString());
            text = str[i].toString();
            System.out.println(modNum);
            System.out.println(text);
            if (input%modNum == 0) {
                output = output.concat(text);
            }
        }
        System.out.println(output);
    }

}
