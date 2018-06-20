package codecheck;

public class App {


    public static void main(String[] args) {
        String[]base = new String[100];
        int modNum = 0;
        String text = null;
        int input = 0;
        String output = null;
        for (int i = 0, l = args.length; i < l; i++) {
            if (!args[i].toString().contains(":")) {
                input = Integer.parseInt(args[i].toString());
                System.out.println(input);
            } else {
                base = args[i].toString().split(":", 0);
                System.out.println(base[i].toString());
                System.out.println(base[i+1].toString());
            }

            //String output = String.format("argv[%s]: %s", i, args[i]);
        }
        for (int i = 0, l = base.length; i < l; ) {
            modNum = Integer.parseInt(base[i].toString());
            text = base[i+1].toString();
            System.out.println(modNum);
            System.out.println(text);
            if (input%modNum == 0) {
                output = output.concat(text);
            }
            i +=2;
        }
        System.out.println(output);
    }

}
