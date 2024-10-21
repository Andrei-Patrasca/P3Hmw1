public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ,let's explore the World");
        System.out.println("Program Arguments:");
        if (args.length == 0) {
            System.out.println("Error: No arguments provided.");
            return;
        }

        for(String arg : args){
            System.out.println(arg);
        }

        String first_arg=args[0];
        switch (first_arg){
            case "hello":
                System.out.println("Hello World");
                break;
                default:
                    System.out.println("Error");
        }

    }
}