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
            }

            //String output = String.format("argv[%s]: %s", i, args[i]);
        }
        for (int i = 0, l = args.length; i < l-1; ) {
            String[] array = args[i].toString().split(":", 0);
            modNum = Integer.parseInt(base[i].toString();
            text = array[i+1].toString();
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
