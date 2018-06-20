package codecheck;

public class App {


    public static void main(String[] args) {
        String[] base = new String[2];
        String[] str = new String[1000];
        String[] modNum = new String[1000];
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
                modNum[i] = base[0].toString();
                str[i] = base[1].toString();
                System.out.println(modNum[i].toString());
                System.out.println(str[i].toString());
            }
        }
        for (int i = 0, l = modNum.length; i < l; i++) {
            int modnum = Integer.parseInt(modNum[i].toString());
            if (input%modnum  == 0) {
                output = output.concat(str[i].toString());
            }
            System.out.println(modnum);
        }
        System.out.println(output);
    }

}
